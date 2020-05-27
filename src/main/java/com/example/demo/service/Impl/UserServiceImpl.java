package com.example.demo.service.Impl;

import com.example.demo.dao.CenterUserInfo;
import com.example.demo.dao.TeamMenuConfig;
import com.example.demo.dao.mapper.CenterUserInfoMapper;
import com.example.demo.dao.secondMapper.TeamMenuConfigMapper;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private CenterUserInfoMapper centerUserInfoMapper;

    @Autowired
    private TeamMenuConfigMapper teamMenuConfigMapper;

//    @Autowired
//    @Qualifier("firstJdbcTemplate")
//    private JdbcTemplate firstJdbcTemplate;

    @Override
    public List<CenterUserInfo> queryAll() {
        return null;
    }

    @Override
    public CenterUserInfo findUserById(int id) {
        String key = "user_" + id;

        ValueOperations<String, CenterUserInfo> operations = redisTemplate.opsForValue();

        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) {
            CenterUserInfo user = operations.get(key);
            System.out.println("==========从缓存中获得数据=========");
            System.out.println(user.getName());
            System.out.println("==============================");
            return user;
        } else {
            CenterUserInfo user = centerUserInfoMapper.selectByPrimaryKey(id);
            System.out.println("==========从数据表中获得数据=========");
            System.out.println(user.getName());
            System.out.println("==============================");

            // 写入缓存
            operations.set(key, user, 5, TimeUnit.HOURS);
            return user;
        }

    }

    @Override
    public int updateUser(CenterUserInfo user) {
        return 0;
    }

    @Override
    public int deleteUserById(int id) {
        return 0;
    }

    @Override
//    @Transactional(value = "secondTransactionManager",rollbackFor = Exception.class)
    public TeamMenuConfig getSecond(Long id) {
        TeamMenuConfig teamMenuConfig =  teamMenuConfigMapper.selectByPrimaryKey(id);
        return teamMenuConfig;
    }
}

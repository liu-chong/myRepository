package com.example.demo.dao.mapper;

import com.example.demo.dao.CenterUserInfo;
import com.example.demo.dao.CenterUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CenterUserInfoMapper {
    long countByExample(CenterUserInfoExample example);

    int deleteByExample(CenterUserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CenterUserInfo record);

    int insertSelective(CenterUserInfo record);

    List<CenterUserInfo> selectByExampleWithRowbounds(CenterUserInfoExample example, RowBounds rowBounds);

    List<CenterUserInfo> selectByExample(CenterUserInfoExample example);

    CenterUserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CenterUserInfo record, @Param("example") CenterUserInfoExample example);

    int updateByExample(@Param("record") CenterUserInfo record, @Param("example") CenterUserInfoExample example);

    int updateByPrimaryKeySelective(CenterUserInfo record);

    int updateByPrimaryKey(CenterUserInfo record);
}
package com.example.demo.dao.secondMapper;

import com.example.demo.dao.TeamMenuConfig;
import com.example.demo.dao.TeamMenuConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TeamMenuConfigMapper {
    int countByExample(TeamMenuConfigExample example);

    int deleteByExample(TeamMenuConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TeamMenuConfig record);

    int insertSelective(TeamMenuConfig record);

    List<TeamMenuConfig> selectByExampleWithRowbounds(TeamMenuConfigExample example, RowBounds rowBounds);

    List<TeamMenuConfig> selectByExample(TeamMenuConfigExample example);

    TeamMenuConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TeamMenuConfig record, @Param("example") TeamMenuConfigExample example);

    int updateByExample(@Param("record") TeamMenuConfig record, @Param("example") TeamMenuConfigExample example);

    int updateByPrimaryKeySelective(TeamMenuConfig record);

    int updateByPrimaryKey(TeamMenuConfig record);
}
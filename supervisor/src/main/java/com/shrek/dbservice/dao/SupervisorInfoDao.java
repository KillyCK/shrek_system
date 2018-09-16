package com.shrek.dbservice.dao;

import com.shrek.dbservice.entity.SupervisorInfo;
import com.shrek.dbservice.entity.SupervisorInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupervisorInfoDao {
    long countByExample(SupervisorInfoExample example);

    int deleteByExample(SupervisorInfoExample example);

    int deleteByPrimaryKey(Integer supervisorInfoId);

    int insert(SupervisorInfo record);

    int insertSelective(SupervisorInfo record);

    List<SupervisorInfo> selectByExample(SupervisorInfoExample example);

    SupervisorInfo selectByPrimaryKey(Integer supervisorInfoId);

    int updateByExampleSelective(@Param("record") SupervisorInfo record, @Param("example") SupervisorInfoExample example);

    int updateByExample(@Param("record") SupervisorInfo record, @Param("example") SupervisorInfoExample example);

    int updateByPrimaryKeySelective(SupervisorInfo record);

    int updateByPrimaryKey(SupervisorInfo record);
}
package com.shrek.dbservice.dao;

import com.shrek.dbservice.entity.Supervisor;
import com.shrek.dbservice.entity.SupervisorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupervisorDao {
    long countByExample(SupervisorExample example);

    int deleteByExample(SupervisorExample example);

    int deleteByPrimaryKey(Integer supervisorId);

    int insert(Supervisor record);

    int insertSelective(Supervisor record);

    List<Supervisor> selectByExample(SupervisorExample example);

    Supervisor selectByPrimaryKey(Integer supervisorId);

    int updateByExampleSelective(@Param("record") Supervisor record, @Param("example") SupervisorExample example);

    int updateByExample(@Param("record") Supervisor record, @Param("example") SupervisorExample example);

    int updateByPrimaryKeySelective(Supervisor record);

    int updateByPrimaryKey(Supervisor record);
}
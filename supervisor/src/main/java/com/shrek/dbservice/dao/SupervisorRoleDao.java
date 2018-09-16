package com.shrek.dbservice.dao;

import com.shrek.dbservice.entity.SupervisorRole;
import com.shrek.dbservice.entity.SupervisorRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupervisorRoleDao {
    long countByExample(SupervisorRoleExample example);

    int deleteByExample(SupervisorRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupervisorRole record);

    int insertSelective(SupervisorRole record);

    List<SupervisorRole> selectByExample(SupervisorRoleExample example);

    SupervisorRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupervisorRole record, @Param("example") SupervisorRoleExample example);

    int updateByExample(@Param("record") SupervisorRole record, @Param("example") SupervisorRoleExample example);

    int updateByPrimaryKeySelective(SupervisorRole record);

    int updateByPrimaryKey(SupervisorRole record);
}
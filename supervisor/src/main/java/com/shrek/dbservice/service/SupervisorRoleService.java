package com.shrek.dbservice.service;

import com.shrek.dbservice.entity.SupervisorRole;
import com.shrek.dbservice.entity.SupervisorRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * service－管理员认证
 * @author shrek
 * create date ：2018年6月2日 上午10:01:18
 */
public interface SupervisorRoleService {

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

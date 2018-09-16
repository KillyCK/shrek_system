package com.shrek.dbservice.service;

import com.shrek.dbservice.entity.Role;
import com.shrek.dbservice.entity.RoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * service - 角色
 * @author shrek
 * create date ：2018年6月2日 上午10:00:17
 */
public interface RoleService {
	
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

}

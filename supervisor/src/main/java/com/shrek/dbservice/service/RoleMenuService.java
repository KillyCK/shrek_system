package com.shrek.dbservice.service;

import com.shrek.dbservice.entity.RoleMenu;
import com.shrek.dbservice.entity.RoleMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * service － 角色菜单
 * @author shrek
 * create date ：2018年6月2日 上午9:59:48
 */
public interface RoleMenuService {
	
    long countByExample(RoleMenuExample example);

    int deleteByExample(RoleMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);

    List<RoleMenu> selectByExample(RoleMenuExample example);

    RoleMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    int updateByExample(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    int updateByPrimaryKeySelective(RoleMenu record);

    int updateByPrimaryKey(RoleMenu record);

}

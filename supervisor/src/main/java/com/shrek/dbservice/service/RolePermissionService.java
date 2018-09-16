package com.shrek.dbservice.service;

import com.shrek.dbservice.entity.RolePermission;
import com.shrek.dbservice.entity.RolePermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * service - 角色权限
 * @author shrek
 * create date ：2018年6月3日 下午11:58:24
 */
public interface RolePermissionService {

    long countByExample(RolePermissionExample example);

    int deleteByExample(RolePermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    List<RolePermission> selectByExample(RolePermissionExample example);

    RolePermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RolePermission record, @Param("example") RolePermissionExample example);

    int updateByExample(@Param("record") RolePermission record, @Param("example") RolePermissionExample example);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}

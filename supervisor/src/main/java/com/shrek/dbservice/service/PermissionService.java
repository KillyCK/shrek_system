package com.shrek.dbservice.service;

import com.shrek.dbservice.entity.Permission;
import com.shrek.dbservice.entity.PermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * service-权限
 * @author shrek
 * create date ：2018年6月3日 下午11:58:05
 */
public interface PermissionService {

    long countByExample(PermissionExample example);

    int deleteByExample(PermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByExample(PermissionExample example);

    Permission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}

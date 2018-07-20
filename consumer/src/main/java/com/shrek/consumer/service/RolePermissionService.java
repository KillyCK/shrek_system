package com.shrek.consumer.service;

import com.shrek.consumer.entity.RolePermission;
import com.shrek.consumer.entity.RolePermissionExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 角色权限
 * @author shrek
 * create date ：2018年6月3日 下午11:55:39
 */
@FeignClient(value = "SHREKSUPERVISOR")
public interface RolePermissionService {
	
	@RequestMapping(value = "/rolePermission/countByExample",method = RequestMethod.POST)
    long countByExample(@RequestBody RolePermissionExample example);

	@RequestMapping(value = "/rolePermission/deleteByExample",method = RequestMethod.DELETE)
    int deleteByExample(@RequestBody RolePermissionExample example);

	@RequestMapping(value = "/rolePermission/deleteByPrimaryKey",method = RequestMethod.DELETE)
    int deleteByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/rolePermission/insert",method = RequestMethod.PUT)
    int insert(@RequestBody RolePermission record);

	@RequestMapping(value = "/rolePermission/insertSelective",method = RequestMethod.PUT)
    int insertSelective(@RequestBody RolePermission record);

	@RequestMapping(value = "/rolePermission/selectByExample",method = RequestMethod.POST)
    List<RolePermission> selectByExample(@RequestBody RolePermissionExample example);

	@RequestMapping(value = "/rolePermission/selectByPrimaryKey",method = RequestMethod.POST)
    RolePermission selectByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/rolePermission/updateByExampleSelective",method = RequestMethod.PUT)
    int updateByExampleSelective(@RequestParam("record") RolePermission record, @RequestParam("example") RolePermissionExample example);

	@RequestMapping(value = "/rolePermission/updateByExample",method = RequestMethod.PUT)
    int updateByExample(@RequestParam("record") RolePermission record, @RequestParam("example") RolePermissionExample example);

	@RequestMapping(value = "/rolePermission/updateByPrimaryKeySelective",method = RequestMethod.PUT)
    int updateByPrimaryKeySelective(@RequestBody RolePermission record);

	@RequestMapping(value = "/rolePermission/updateByPrimaryKey",method = RequestMethod.PUT)
    int updateByPrimaryKey(@RequestBody RolePermission record);
}
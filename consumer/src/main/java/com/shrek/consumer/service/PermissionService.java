package com.shrek.consumer.service;

import com.shrek.consumer.entity.Permission;
import com.shrek.consumer.entity.PermissionExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * dao-权限
 * @author shrek
 * create date ：2018年6月3日 下午11:55:16
 */
@FeignClient(value = "SHREKSUPERVISOR")
public interface PermissionService {
	
	@RequestMapping(value = "/permission/countByExample",method = RequestMethod.POST)
    long countByExample(@RequestBody PermissionExample example);

	@RequestMapping(value = "/permission/deleteByExample",method = RequestMethod.DELETE)
    int deleteByExample(@RequestBody PermissionExample example);

	@RequestMapping(value = "/permission/deleteByPrimaryKey",method = RequestMethod.DELETE)
    int deleteByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/permission/insert",method = RequestMethod.PUT)
    int insert(@RequestBody Permission record);

	@RequestMapping(value = "/permission/insertSelective",method = RequestMethod.PUT)
    int insertSelective(@RequestBody Permission record);

	@RequestMapping(value = "/permission/selectByExample",method = RequestMethod.POST)
    List<Permission> selectByExample(@RequestBody PermissionExample example);

	@RequestMapping(value = "/permission/selectByPrimaryKey",method = RequestMethod.POST)
    Permission selectByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/permission/updateByExampleSelective",method = RequestMethod.PUT)
    int updateByExampleSelective(@RequestParam("record") Permission record, @RequestParam("example") PermissionExample example);

	@RequestMapping(value = "/permission/updateByExample",method = RequestMethod.PUT)
    int updateByExample(@RequestParam("record") Permission record, @RequestParam("example") PermissionExample example);

	@RequestMapping(value = "/permission/updateByPrimaryKeySelective",method = RequestMethod.PUT)
    int updateByPrimaryKeySelective(@RequestBody Permission record);

	@RequestMapping(value = "/permission/updateByPrimaryKey",method = RequestMethod.PUT)
    int updateByPrimaryKey(@RequestBody Permission record);
}
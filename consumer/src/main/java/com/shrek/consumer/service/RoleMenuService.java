package com.shrek.consumer.service;

import com.shrek.consumer.entity.RoleMenu;
import com.shrek.consumer.entity.RoleMenuExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "SHREKSUPERVISOR")
public interface RoleMenuService {
	
	@RequestMapping(value = "/roleMenu/countByExample",method = RequestMethod.POST)
    long countByExample(@RequestBody RoleMenuExample example);

	@RequestMapping(value = "/roleMenu/deleteByExample",method = RequestMethod.DELETE)
    int deleteByExample(@RequestBody RoleMenuExample example);

	@RequestMapping(value = "/roleMenu/deleteByPrimaryKey",method = RequestMethod.DELETE)
    int deleteByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/roleMenu/insert",method = RequestMethod.PUT)
    int insert(@RequestBody RoleMenu record);

	@RequestMapping(value = "/roleMenu/insertSelective",method = RequestMethod.PUT)
    int insertSelective(@RequestBody RoleMenu record);

	@RequestMapping(value = "/roleMenu/selectByExample",method = RequestMethod.POST)
    List<RoleMenu> selectByExample(@RequestBody RoleMenuExample example);

	@RequestMapping(value = "/roleMenu/selectByPrimaryKey",method = RequestMethod.POST)
    RoleMenu selectByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/roleMenu/updateByExampleSelective",method = RequestMethod.PUT)
    int updateByExampleSelective(@RequestParam("record") RoleMenu record, @RequestParam("example") RoleMenuExample example);

	@RequestMapping(value = "/roleMenu/updateByExample",method = RequestMethod.PUT)
    int updateByExample(@RequestParam("record") RoleMenu record, @RequestParam("example") RoleMenuExample example);

	@RequestMapping(value = "/roleMenu/updateByPrimaryKeySelective",method = RequestMethod.PUT)
    int updateByPrimaryKeySelective(@RequestBody RoleMenu record);

	@RequestMapping(value = "/roleMenu/updateByPrimaryKey",method = RequestMethod.PUT)
    int updateByPrimaryKey(@RequestBody RoleMenu record);
}
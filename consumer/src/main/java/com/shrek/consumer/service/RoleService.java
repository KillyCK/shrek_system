package com.shrek.consumer.service;

import com.shrek.consumer.entity.Role;
import com.shrek.consumer.entity.RoleExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "SHREKSUPERVISOR")
public interface RoleService {
	
	@RequestMapping(value = "/role/countByExample",method = RequestMethod.POST)
    long countByExample(@RequestBody RoleExample example);

	@RequestMapping(value = "/role/deleteByExample",method = RequestMethod.DELETE)
    int deleteByExample(@RequestBody RoleExample example);

	@RequestMapping(value = "/role/deleteByPrimaryKey",method = RequestMethod.DELETE)
    int deleteByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/role/insert",method = RequestMethod.PUT)
    int insert(@RequestBody Role record);

	@RequestMapping(value = "/role/insertSelective",method = RequestMethod.PUT)
    int insertSelective(@RequestBody Role record);

	@RequestMapping(value = "/role/selectByExample",method = RequestMethod.POST)
    List<Role> selectByExample(@RequestBody RoleExample example);

	@RequestMapping(value = "/role/selectByPrimaryKey",method = RequestMethod.POST)
    Role selectByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/role/updateByExampleSelective",method = RequestMethod.PUT)
    int updateByExampleSelective(@RequestParam("record") Role record, @RequestParam("example") RoleExample example);

	@RequestMapping(value = "/role/updateByExample",method = RequestMethod.PUT)
    int updateByExample(@RequestParam("record") Role record, @RequestParam("example") RoleExample example);

	@RequestMapping(value = "/role/updateByPrimaryKeySelective",method = RequestMethod.PUT)
    int updateByPrimaryKeySelective(@RequestBody Role record);

	@RequestMapping(value = "/role/updateByPrimaryKey",method = RequestMethod.PUT)
    int updateByPrimaryKey(@RequestBody Role record);
}
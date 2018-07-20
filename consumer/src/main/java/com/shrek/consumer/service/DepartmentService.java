package com.shrek.consumer.service;

import com.shrek.consumer.entity.Department;
import com.shrek.consumer.entity.DepartmentExample;
import com.shrek.consumer.hystrixService.DepartmentServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * service - 部门
 * @author shrek
 * create date ：2018年6月4日 下午4:45:51
 */
@FeignClient(value = "SHREKSUPERVISOR", fallback = DepartmentServiceHystric.class)
public interface DepartmentService {
	
	@RequestMapping(value = "/department/countByExample",method = RequestMethod.POST)
    long countByExample(@RequestBody final DepartmentExample example);

	@RequestMapping(value = "/department/deleteByExample",method = RequestMethod.DELETE)
    int deleteByExample(@RequestBody final DepartmentExample example);

	@RequestMapping(value = "/department/deleteByPrimaryKey",method = RequestMethod.DELETE)
    int deleteByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/department/insert",method = RequestMethod.PUT)
    int insert(@RequestBody final Department record);

	@RequestMapping(value = "/department/insertSelective",method = RequestMethod.PUT)
    int insertSelective(@RequestBody final Department record);

	@RequestMapping(value = "/department/selectByExample",method = RequestMethod.POST)
    List<Department> selectByExample(@RequestBody final DepartmentExample example);

	@RequestMapping(value = "/department/selectByPrimaryKey",method = RequestMethod.POST)
    Department selectByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/department/updateByExampleSelective",method = RequestMethod.PUT)
    int updateByExampleSelective(@RequestParam("record") final Department record, @RequestParam("example") final DepartmentExample example);

	@RequestMapping(value = "/department/updateByExample",method = RequestMethod.PUT)
    int updateByExample(@RequestParam("record") final Department record, @RequestParam("example") final DepartmentExample example);

	@RequestMapping(value = "/department/updateByPrimaryKeySelective",method = RequestMethod.PUT)
    int updateByPrimaryKeySelective(@RequestBody final Department record);

	@RequestMapping(value = "/department/updateByPrimaryKey",method = RequestMethod.PUT)
    int updateByPrimaryKey(@RequestBody final Department record);
}
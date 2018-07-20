package com.shrek.consumer.service;

import com.shrek.consumer.entity.Supervisor;
import com.shrek.consumer.entity.SupervisorExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "SHREKSUPERVISOR")
public interface SupervisorService {
	
	@RequestMapping(value = "/supervisor/countByExample",method = RequestMethod.POST)
    long countByExample(@RequestBody SupervisorExample example);

	@RequestMapping(value = "/supervisor/deleteByExample",method = RequestMethod.DELETE)
    int deleteByExample(@RequestBody SupervisorExample example);

	@RequestMapping(value = "/supervisor/deleteByPrimaryKey",method = RequestMethod.DELETE)
    int deleteByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/supervisor/insert",method = RequestMethod.PUT)
    int insert(@RequestBody Supervisor record);

	@RequestMapping(value = "/supervisor/insertSelective",method = RequestMethod.PUT)
    int insertSelective(@RequestBody Supervisor record);

	@RequestMapping(value = "/supervisor/selectByExample",method = RequestMethod.POST)
    List<Supervisor> selectByExample(@RequestBody SupervisorExample example);

	@RequestMapping(value = "/supervisor/selectByPrimaryKey",method = RequestMethod.POST)
    Supervisor selectByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/supervisor/updateByExampleSelective",method = RequestMethod.PUT)
    int updateByExampleSelective(@RequestParam("record") Supervisor record, @RequestParam("example") SupervisorExample example);

	@RequestMapping(value = "/supervisor/updateByExample",method = RequestMethod.PUT)
    int updateByExample(@RequestParam("record") Supervisor record, @RequestParam("example") SupervisorExample example);

	@RequestMapping(value = "/supervisor/updateByPrimaryKeySelective",method = RequestMethod.PUT)
    int updateByPrimaryKeySelective(@RequestBody Supervisor record);

	@RequestMapping(value = "/supervisor/updateByPrimaryKey",method = RequestMethod.PUT)
    int updateByPrimaryKey(@RequestBody Supervisor record);
}
package com.shrek.consumer.service;

import com.shrek.consumer.entity.SupervisorInfo;
import com.shrek.consumer.entity.SupervisorInfoExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "SHREKSUPERVISOR")
public interface SupervisorInfoService {
	
	@RequestMapping(value = "/supervisorInfo/countByExample",method = RequestMethod.POST)
    long countByExample(@RequestBody SupervisorInfoExample example);

	@RequestMapping(value = "/supervisorInfo/deleteByExample",method = RequestMethod.DELETE)
    int deleteByExample(@RequestBody SupervisorInfoExample example);

	@RequestMapping(value = "/supervisorInfo/deleteByPrimaryKey",method = RequestMethod.DELETE)
    int deleteByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/supervisorInfo/insert",method = RequestMethod.PUT)
    int insert(@RequestBody SupervisorInfo record);

	@RequestMapping(value = "/supervisorInfo/insertSelective",method = RequestMethod.PUT)
    int insertSelective(@RequestBody SupervisorInfo record);

	@RequestMapping(value = "/supervisorInfo/selectByExample",method = RequestMethod.POST)
    List<SupervisorInfo> selectByExample(@RequestBody SupervisorInfoExample example);

	@RequestMapping(value = "/supervisorInfo/selectByPrimaryKey",method = RequestMethod.POST)
    SupervisorInfo selectByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/supervisorInfo/updateByExampleSelective",method = RequestMethod.PUT)
    int updateByExampleSelective(@RequestParam("record") SupervisorInfo record, @RequestParam("example") SupervisorInfoExample example);

	@RequestMapping(value = "/supervisorInfo/updateByExample",method = RequestMethod.PUT)
    int updateByExample(@RequestParam("record") SupervisorInfo record, @RequestParam("example") SupervisorInfoExample example);

	@RequestMapping(value = "/supervisorInfo/updateByPrimaryKeySelective",method = RequestMethod.PUT)
    int updateByPrimaryKeySelective(@RequestBody SupervisorInfo record);

	@RequestMapping(value = "/supervisorInfo/updateByPrimaryKey",method = RequestMethod.PUT)
    int updateByPrimaryKey(@RequestBody SupervisorInfo record);
}
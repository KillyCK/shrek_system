package com.shrek.consumer.service;

import com.shrek.consumer.entity.Position;
import com.shrek.consumer.entity.PositionExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "SHREKSUPERVISOR")
public interface PositionService {
	
	@RequestMapping(value = "/position/countByExample",method = RequestMethod.POST)
    long countByExample(@RequestBody PositionExample example);

	@RequestMapping(value = "/position/deleteByExample",method = RequestMethod.DELETE)
    int deleteByExample(@RequestBody PositionExample example);

	@RequestMapping(value = "/position/deleteByPrimaryKey",method = RequestMethod.DELETE)
    int deleteByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/position/insert",method = RequestMethod.PUT)
    int insert(@RequestBody Position record);

	@RequestMapping(value = "/position/insertSelective",method = RequestMethod.PUT)
    int insertSelective(@RequestBody Position record);

	@RequestMapping(value = "/position/selectByExample",method = RequestMethod.POST)
    List<Position> selectByExample(@RequestBody PositionExample example);

	@RequestMapping(value = "/position/selectByPrimaryKey",method = RequestMethod.POST)
    Position selectByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/position/updateByExampleSelective",method = RequestMethod.PUT)
    int updateByExampleSelective(@RequestParam("record") Position record, @RequestParam("example") PositionExample example);

	@RequestMapping(value = "/position/updateByExample",method = RequestMethod.PUT)
    int updateByExample(@RequestParam("record") Position record, @RequestParam("example") PositionExample example);

	@RequestMapping(value = "/position/updateByPrimaryKeySelective",method = RequestMethod.PUT)
    int updateByPrimaryKeySelective(@RequestBody Position record);

	@RequestMapping(value = "/position/updateByPrimaryKey",method = RequestMethod.PUT)
    int updateByPrimaryKey(@RequestBody Position record);
}
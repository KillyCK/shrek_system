package com.shrek.consumer.service;

import com.shrek.consumer.entity.Menu;
import com.shrek.consumer.entity.MenuExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "SHREKSUPERVISOR")
public interface MenuService {
	
	@RequestMapping(value = "/menu/countByExample",method = RequestMethod.POST)
    long countByExample(@RequestBody MenuExample example);

	@RequestMapping(value = "/menu/deleteByExample",method = RequestMethod.DELETE)
    int deleteByExample(@RequestBody MenuExample example);

	@RequestMapping(value = "/menu/deleteByPrimaryKey",method = RequestMethod.DELETE)
    int deleteByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/menu/insert",method = RequestMethod.PUT)
    int insert(@RequestBody Menu record);

	@RequestMapping(value = "/menu/insertSelective",method = RequestMethod.PUT)
    int insertSelective(@RequestBody Menu record);

	@RequestMapping(value = "/menu/selectByExample",method = RequestMethod.POST)
    List<Menu> selectByExample(@RequestBody MenuExample example);

	@RequestMapping(value = "/menu/selectByPrimaryKey",method = RequestMethod.POST)
    Menu selectByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/menu/updateByExampleSelective",method = RequestMethod.PUT)
    int updateByExampleSelective(@RequestParam("record") Menu record, @RequestParam("example") MenuExample example);

	@RequestMapping(value = "/menu/updateByExample",method = RequestMethod.PUT)
    int updateByExample(@RequestParam("record") Menu record, @RequestParam("example") MenuExample example);

	@RequestMapping(value = "/menu/updateByPrimaryKeySelective",method = RequestMethod.PUT)
    int updateByPrimaryKeySelective(@RequestBody Menu record);

	@RequestMapping(value = "/menu/updateByPrimaryKey",method = RequestMethod.PUT)
    int updateByPrimaryKey(@RequestBody Menu record);
}
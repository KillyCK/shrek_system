package com.shrek.oauth2service.service;

import com.shrek.oauth2service.entity.ShrekClientDetails;
import com.shrek.oauth2service.entity.ShrekClientDetailsExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "SHREKSUPERVISOR")
public interface ShrekClientDetailsService {
	
	@RequestMapping(value = "/shrekClientDetails/countByExample",method = RequestMethod.POST)
    long countByExample(@RequestBody ShrekClientDetailsExample example);

	@RequestMapping(value = "/shrekClientDetails/deleteByExample",method = RequestMethod.DELETE)
    int deleteByExample(@RequestBody ShrekClientDetailsExample example);

	@RequestMapping(value = "/shrekClientDetails/deleteByPrimaryKey",method = RequestMethod.DELETE)
    int deleteByPrimaryKey(@RequestParam("clientId") String clientId);

	@RequestMapping(value = "/shrekClientDetails/insert",method = RequestMethod.PUT)
    int insert(@RequestBody ShrekClientDetails record);

	@RequestMapping(value = "/shrekClientDetails/insertSelective",method = RequestMethod.PUT)
    int insertSelective(@RequestBody ShrekClientDetails record);

	@RequestMapping(value = "/shrekClientDetails/selectByExample",method = RequestMethod.POST)
    List<ShrekClientDetails> selectByExample(@RequestBody ShrekClientDetailsExample example);

	@RequestMapping(value = "/shrekClientDetails/selectByPrimaryKey",method = RequestMethod.POST)
    ShrekClientDetails selectByPrimaryKey(@RequestParam("clientId") String clientId);

	@RequestMapping(value = "/shrekClientDetails/updateByExampleSelective",method = RequestMethod.PUT)
    int updateByExampleSelective(@RequestParam("record") ShrekClientDetails record, @RequestParam("example") ShrekClientDetailsExample example);

	@RequestMapping(value = "/shrekClientDetails/updateByExample",method = RequestMethod.PUT)
    int updateByExample(@RequestParam("record") ShrekClientDetails record, @RequestParam("example") ShrekClientDetailsExample example);

	@RequestMapping(value = "/shrekClientDetails/updateByPrimaryKeySelective",method = RequestMethod.PUT)
    int updateByPrimaryKeySelective(@RequestBody ShrekClientDetails record);

	@RequestMapping(value = "/shrekClientDetails/updateByPrimaryKey",method = RequestMethod.PUT)
    int updateByPrimaryKey(@RequestBody ShrekClientDetails record);
}
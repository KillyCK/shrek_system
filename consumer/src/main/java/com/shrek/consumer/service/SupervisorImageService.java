package com.shrek.consumer.service;

import com.shrek.consumer.entity.SupervisorImage;
import com.shrek.consumer.entity.SupervisorImageExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "SHREKSUPERVISOR")
public interface SupervisorImageService {
	
	@RequestMapping(value = "/supervisorImage/countByExample",method = RequestMethod.POST)
    long countByExample(@RequestBody SupervisorImageExample example);

	@RequestMapping(value = "/supervisorImage/deleteByExample",method = RequestMethod.DELETE)
    int deleteByExample(@RequestBody SupervisorImageExample example);

	@RequestMapping(value = "/supervisorImage/deleteByPrimaryKey",method = RequestMethod.DELETE)
    int deleteByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/supervisorImage/insert",method = RequestMethod.PUT)
    int insert(@RequestBody SupervisorImage record);

	@RequestMapping(value = "/supervisorImage/insertSelective",method = RequestMethod.PUT)
    int insertSelective(@RequestBody SupervisorImage record);

	@RequestMapping(value = "/supervisorImage/selectByExample",method = RequestMethod.POST)
    List<SupervisorImage> selectByExample(@RequestBody SupervisorImageExample example);

	@RequestMapping(value = "/supervisorImage/selectByPrimaryKey",method = RequestMethod.POST)
    SupervisorImage selectByPrimaryKey(@RequestParam("id") Integer id);

	@RequestMapping(value = "/supervisorImage/updateByExampleSelective",method = RequestMethod.PUT)
    int updateByExampleSelective(@RequestParam("record") SupervisorImage record, @RequestParam("example") SupervisorImageExample example);

	@RequestMapping(value = "/supervisorImage/updateByExample",method = RequestMethod.PUT)
    int updateByExample(@RequestParam("record") SupervisorImage record, @RequestParam("example") SupervisorImageExample example);

	@RequestMapping(value = "/supervisorImage/updateByPrimaryKeySelective",method = RequestMethod.PUT)
    int updateByPrimaryKeySelective(@RequestBody SupervisorImage record);

	@RequestMapping(value = "/supervisorImage/updateByPrimaryKey",method = RequestMethod.PUT)
    int updateByPrimaryKey(@RequestBody SupervisorImage record);
}
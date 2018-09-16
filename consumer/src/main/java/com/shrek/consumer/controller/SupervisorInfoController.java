package com.shrek.consumer.controller;

import com.shrek.consumer.entity.SupervisorInfo;
import com.shrek.consumer.entity.SupervisorInfoExample;
import com.shrek.consumer.service.SupervisorInfoService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 管理员信息
 * @author shrek
 * create date ：2018年6月2日 下午1:43:16
 */
@RestController
@RequestMapping(value="/supervisorInfo")
@Api(value = "SupervisorInfoController", tags = "supervisorInfo相关的api")
public class SupervisorInfoController {

	@Autowired
	private SupervisorInfoService supervisorInfoService;

	@ApiOperation(value="统计supervisorInfo", notes="根据example统计supervisorInfo")
    @ApiImplicitParam(name = "example", value = "管理员信息查询实体supervisorInfoExample", required = true, dataType = "SupervisorInfoExample")
    @RequestMapping(value="/countByExample", method=RequestMethod.POST)
	public long countByExample(@RequestBody SupervisorInfoExample example) {
		return supervisorInfoService.countByExample(example);
	}
    
    @ApiOperation(value="选择删除supervisorInfo", notes="根据example删除supervisorInfo")
    @ApiImplicitParam(name = "example", value = "管理员信息查询实体supervisorInfoExample", required = true, dataType = "SupervisorInfoExample")
    @RequestMapping(value="/deleteByExample", method=RequestMethod.DELETE)
	public int deleteByExample(@RequestBody SupervisorInfoExample example) {
		return supervisorInfoService.deleteByExample(example);
	}

    @ApiOperation(value="主键删除supervisorInfo", notes="根据主键id删除supervisorInfo")
    @RequestMapping(value="/deleteByPrimaryKey", method=RequestMethod.DELETE)
	public int deleteByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return supervisorInfoService.deleteByPrimaryKey(id);
	}

    @ApiOperation(value="添加supervisorInfo", notes="利用supervisorInfo实体进行插入")
    @ApiImplicitParam(name = "record", value = "管理员信息实体supervisorInfo", required = true, dataType = "SupervisorInfo")
    @RequestMapping(value="/insert", method=RequestMethod.PUT)
	public int insert(@RequestBody SupervisorInfo record) {
		return supervisorInfoService.insert(record);
	}

    @ApiOperation(value="选择添加supervisorInfo", notes="利用supervisorInfo实体进行参数选择性的插入")
    @ApiImplicitParam(name = "record", value = "管理员信息实体supervisorInfo", required = true, dataType = "SupervisorInfo")
    @RequestMapping(value="/insertSelective", method=RequestMethod.PUT)
	public int insertSelective(@RequestBody SupervisorInfo record) {
		return supervisorInfoService.insertSelective(record);
	}

    @ApiOperation(value="查询supervisorInfo", notes="利用supervisorInfoExample实体进行查询supervisorInfo集合")
    @ApiImplicitParam(name = "example", value = "管理员信息实体supervisorInfoExample", required = true, dataType = "SupervisorInfoExample")
    @RequestMapping(value="/selectByExample", method=RequestMethod.POST)
	public List<SupervisorInfo> selectByExample(@RequestBody SupervisorInfoExample example) {
		return supervisorInfoService.selectByExample(example);
	}

    @ApiOperation(value="主键查询supervisorInfo", notes="根据主键id查询supervisorInfo")
    @RequestMapping(value="/selectByPrimaryKey", method=RequestMethod.POST)
	public SupervisorInfo selectByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return supervisorInfoService.selectByPrimaryKey(id);
	}

    @ApiOperation(value="选择信息更新管理员信息信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "管理员信息实体", required = true, dataType = "SupervisorInfo"),
            @ApiImplicitParam(name = "example", value = "管理员信息查询实体", required = true, dataType = "SupervisorInfoExample")
    })
    @RequestMapping(value="/updateByExampleSelective", method=RequestMethod.PUT)
	public int updateByExampleSelective(@RequestBody SupervisorInfo record, @RequestBody SupervisorInfoExample example) {
		return supervisorInfoService.updateByExampleSelective(record, example);
	}

    @ApiOperation(value="更新管理员信息信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "管理员信息实体", required = true, dataType = "SupervisorInfo"),
            @ApiImplicitParam(name = "example", value = "管理员信息查询实体", required = true, dataType = "SupervisorInfoExample")
    })
    @RequestMapping(value="/updateByExample", method=RequestMethod.PUT)
	public int updateByExample(@RequestBody SupervisorInfo record, @RequestBody SupervisorInfoExample example) {
		return supervisorInfoService.updateByExample(record, example);
	}

    @ApiOperation(value="更新supervisorInfo", notes="根据supervisorInfo实体进行选择性的参数更新")
    @ApiImplicitParam(name = "record", value = "管理员信息实体supervisorInfo", required = true, dataType = "SupervisorInfo")
    @RequestMapping(value="/updateByPrimaryKeySelective", method=RequestMethod.PUT)
	public int updateByPrimaryKeySelective(@RequestBody SupervisorInfo record) {
		return supervisorInfoService.updateByPrimaryKeySelective(record);
	}

    @ApiOperation(value="更新supervisorInfo", notes="根据supervisorInfo实体进行更新")
    @ApiImplicitParam(name = "record", value = "管理员信息实体supervisorInfo", required = true, dataType = "SupervisorInfo")
    @RequestMapping(value="/updateByPrimaryKey", method=RequestMethod.PUT)
	public int updateByPrimaryKey(@RequestBody SupervisorInfo record) {
		return supervisorInfoService.updateByPrimaryKey(record);
	}
}

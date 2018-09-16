package com.shrek.consumer.controller;

import com.shrek.consumer.entity.Supervisor;
import com.shrek.consumer.entity.SupervisorExample;
import com.shrek.consumer.service.SupervisorService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * supervisor 的controller
 * @author shrek
 * create date ：2018年5月31日 下午12:05:33
 */
@RestController
@RequestMapping(value="/supervisor") 
@Api(value = "SupervisorController", tags = "Supervisor相关的api")
public class SupervisorController {
	
	@Autowired
	SupervisorService supervisorService;
	
    @ApiOperation(value="统计supervisor", notes="根据example统计supervisor")
    @ApiImplicitParam(name = "example", value = "管理员查询实体SupervisorExample", required = true, dataType = "SupervisorExample")
    @RequestMapping(value="/countByExample", method=RequestMethod.POST)
	public long countByExample(@RequestBody SupervisorExample example) {
		return supervisorService.countByExample(example);
	}
    
    @ApiOperation(value="选择删除supervisor", notes="根据example删除supervisor")
    @ApiImplicitParam(name = "example", value = "管理员查询实体SupervisorExample", required = true, dataType = "SupervisorExample")
    @RequestMapping(value="/deleteByExample", method=RequestMethod.DELETE)
	public int deleteByExample(@RequestBody SupervisorExample example) {
		return supervisorService.deleteByExample(example);
	}

    @ApiOperation(value="主键删除supervisor", notes="根据主键id删除supervisor")
    @RequestMapping(value="/deleteByPrimaryKey", method=RequestMethod.DELETE)
	public int deleteByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return supervisorService.deleteByPrimaryKey(id);
	}

    @ApiOperation(value="添加supervisor", notes="利用supervisor实体进行插入")
    @ApiImplicitParam(name = "record", value = "管理员实体Supervisor", required = true, dataType = "Supervisor")
    @RequestMapping(value="/insert", method=RequestMethod.PUT)
	public int insert(@RequestBody Supervisor record) {
		return supervisorService.insert(record);
	}

    @ApiOperation(value="选择添加supervisor", notes="利用supervisor实体进行参数选择性的插入")
    @ApiImplicitParam(name = "record", value = "管理员实体Supervisor", required = true, dataType = "Supervisor")
    @RequestMapping(value="/insertSelective", method=RequestMethod.PUT)
	public int insertSelective(@RequestBody Supervisor record) {
		return supervisorService.insertSelective(record);
	}

    @ApiOperation(value="查询supervisor", notes="利用supervisorExample实体进行查询supervisor集合")
    @ApiImplicitParam(name = "example", value = "管理员实体SupervisorExample", required = true, dataType = "SupervisorExample")
    @RequestMapping(value="/selectByExample", method=RequestMethod.POST)
	public List<Supervisor> selectByExample(@RequestBody SupervisorExample example) {

		System.out.println(example.toString());
		return supervisorService.selectByExample(example);
	}

    @ApiOperation(value="主键查询supervisor", notes="根据主键id查询supervisor")
    @RequestMapping(value="/selectByPrimaryKey", method=RequestMethod.POST)
	public Supervisor selectByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return supervisorService.selectByPrimaryKey(id);
	}

    @ApiOperation(value="选择信息更新管理员信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "管理员实体", required = true, dataType = "Supervisor"),
            @ApiImplicitParam(name = "example", value = "管理员查询实体", required = true, dataType = "SupervisorExample")
    })
    @RequestMapping(value="/updateByExampleSelective", method=RequestMethod.PUT)
	public int updateByExampleSelective(@RequestBody Supervisor record, @RequestBody SupervisorExample example) {
		return supervisorService.updateByExampleSelective(record, example);
	}

    @ApiOperation(value="更新管理员信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "管理员实体", required = true, dataType = "Supervisor"),
            @ApiImplicitParam(name = "example", value = "管理员查询实体", required = true, dataType = "SupervisorExample")
    })
    @RequestMapping(value="/updateByExample", method=RequestMethod.PUT)
	public int updateByExample(@RequestBody Supervisor record, @RequestBody SupervisorExample example) {
		return supervisorService.updateByExample(record, example);
	}

    @ApiOperation(value="更新supervisor", notes="根据supervisor实体进行选择性的参数更新")
    @ApiImplicitParam(name = "record", value = "管理员实体Supervisor", required = true, dataType = "Supervisor")
    @RequestMapping(value="/updateByPrimaryKeySelective", method=RequestMethod.PUT)
	public int updateByPrimaryKeySelective(@RequestBody Supervisor record) {
		return supervisorService.updateByPrimaryKeySelective(record);
	}

    @ApiOperation(value="更新supervisor", notes="根据supervisor实体进行更新")
    @ApiImplicitParam(name = "record", value = "管理员实体Supervisor", required = true, dataType = "Supervisor")
    @RequestMapping(value="/updateByPrimaryKey", method=RequestMethod.PUT)
	public int updateByPrimaryKey(@RequestBody Supervisor record) {
		return supervisorService.updateByPrimaryKey(record);
	}

}

package com.shrek.dbservice.controller;

import com.shrek.dbservice.service.SupervisorRoleService;
import com.shrek.dbservice.entity.SupervisorRole;
import com.shrek.dbservice.entity.SupervisorRoleExample;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 管理员角色
 * @author shrek
 * create date ：2018年6月2日 下午1:43:16
 */
@RestController
@RequestMapping(value="/supervisorRole")
@Api(value = "SupervisorRoleController", tags = "supervisorRole相关的api")
public class SupervisorRoleController {

	@Autowired
	private SupervisorRoleService supervisorRoleService;

	@ApiOperation(value="统计supervisorRole", notes="根据example统计supervisorRole")
    @ApiImplicitParam(name = "example", value = "管理员信息查询实体supervisorRoleExample", required = true, dataType = "SupervisorRoleExample")
    @RequestMapping(value="/countByExample", method=RequestMethod.POST)
	public long countByExample(@RequestBody SupervisorRoleExample example) {
		return supervisorRoleService.countByExample(example);
	}
    
    @ApiOperation(value="选择删除supervisorRole", notes="根据example删除supervisorRole")
    @ApiImplicitParam(name = "example", value = "管理员信息查询实体supervisorRoleExample", required = true, dataType = "SupervisorRoleExample")
    @RequestMapping(value="/deleteByExample", method=RequestMethod.DELETE)
	public int deleteByExample(@RequestBody SupervisorRoleExample example) {
		return supervisorRoleService.deleteByExample(example);
	}

    @ApiOperation(value="主键删除supervisorRole", notes="根据主键id删除supervisorRole")
    @RequestMapping(value="/deleteByPrimaryKey", method=RequestMethod.DELETE)
	public int deleteByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return supervisorRoleService.deleteByPrimaryKey(id);
	}

    @ApiOperation(value="添加supervisorRole", notes="利用supervisorRole实体进行插入")
    @ApiImplicitParam(name = "record", value = "管理员信息实体supervisorRole", required = true, dataType = "SupervisorRole")
    @RequestMapping(value="/insert", method=RequestMethod.PUT)
	public int insert(@RequestBody SupervisorRole record) {
		return supervisorRoleService.insert(record);
	}

    @ApiOperation(value="选择添加supervisorRole", notes="利用supervisorRole实体进行参数选择性的插入")
    @ApiImplicitParam(name = "record", value = "管理员信息实体supervisorRole", required = true, dataType = "SupervisorRole")
    @RequestMapping(value="/insertSelective", method=RequestMethod.PUT)
	public int insertSelective(@RequestBody SupervisorRole record) {
		return supervisorRoleService.insertSelective(record);
	}

    @ApiOperation(value="查询supervisorRole", notes="利用supervisorRoleExample实体进行查询supervisorRole集合")
    @ApiImplicitParam(name = "example", value = "管理员信息实体supervisorRoleExample", required = true, dataType = "SupervisorRoleExample")
    @RequestMapping(value="/selectByExample", method=RequestMethod.POST)
	public List<SupervisorRole> selectByExample(@RequestBody SupervisorRoleExample example) {
		return supervisorRoleService.selectByExample(example);
	}

    @ApiOperation(value="主键查询supervisorRole", notes="根据主键id查询supervisorRole")
    @RequestMapping(value="/selectByPrimaryKey", method=RequestMethod.POST)
	public SupervisorRole selectByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return supervisorRoleService.selectByPrimaryKey(id);
	}

    @ApiOperation(value="选择信息更新管理员信息信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "管理员信息实体", required = true, dataType = "SupervisorRole"),
            @ApiImplicitParam(name = "example", value = "管理员信息查询实体", required = true, dataType = "SupervisorRoleExample")
    })
    @RequestMapping(value="/updateByExampleSelective", method=RequestMethod.PUT)
	public int updateByExampleSelective(@RequestBody SupervisorRole record, @RequestBody SupervisorRoleExample example) {
		return supervisorRoleService.updateByExampleSelective(record, example);
	}

    @ApiOperation(value="更新管理员信息信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "管理员信息实体", required = true, dataType = "SupervisorRole"),
            @ApiImplicitParam(name = "example", value = "管理员信息查询实体", required = true, dataType = "SupervisorRoleExample")
    })
    @RequestMapping(value="/updateByExample", method=RequestMethod.PUT)
	public int updateByExample(@RequestBody SupervisorRole record, @RequestBody SupervisorRoleExample example) {
		return supervisorRoleService.updateByExample(record, example);
	}

    @ApiOperation(value="更新supervisorRole", notes="根据supervisorRole实体进行选择性的参数更新")
    @ApiImplicitParam(name = "record", value = "管理员信息实体supervisorRole", required = true, dataType = "SupervisorRole")
    @RequestMapping(value="/updateByPrimaryKeySelective", method=RequestMethod.PUT)
	public int updateByPrimaryKeySelective(@RequestBody SupervisorRole record) {
		return supervisorRoleService.updateByPrimaryKeySelective(record);
	}

    @ApiOperation(value="更新supervisorRole", notes="根据supervisorRole实体进行更新")
    @ApiImplicitParam(name = "record", value = "管理员信息实体supervisorRole", required = true, dataType = "SupervisorRole")
    @RequestMapping(value="/updateByPrimaryKey", method=RequestMethod.PUT)
	public int updateByPrimaryKey(@RequestBody SupervisorRole record) {
		return supervisorRoleService.updateByPrimaryKey(record);
	}
}

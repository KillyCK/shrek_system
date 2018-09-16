package com.shrek.consumer.controller;

import com.shrek.consumer.entity.Role;
import com.shrek.consumer.entity.RoleExample;
import com.shrek.consumer.service.RoleService;
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
@RequestMapping(value="/role")
@Api(value = "RoleController", tags = "Role相关的api")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@ApiOperation(value="统计Role", notes="根据example统计Role")
    @ApiImplicitParam(name = "example", value = "管理员信息查询实体RoleExample", required = true, dataType = "RoleExample")
    @RequestMapping(value="/countByExample", method=RequestMethod.POST)
	public long countByExample(@RequestBody RoleExample example) {
		return roleService.countByExample(example);
	}
    
    @ApiOperation(value="选择删除Role", notes="根据example删除Role")
    @ApiImplicitParam(name = "example", value = "管理员信息查询实体RoleExample", required = true, dataType = "RoleExample")
    @RequestMapping(value="/deleteByExample", method=RequestMethod.DELETE)
	public int deleteByExample(@RequestBody RoleExample example) {
		return roleService.deleteByExample(example);
	}

    @ApiOperation(value="主键删除Role", notes="根据主键id删除Role")
    @RequestMapping(value="/deleteByPrimaryKey", method=RequestMethod.DELETE)
	public int deleteByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return roleService.deleteByPrimaryKey(id);
	}

    @ApiOperation(value="添加Role", notes="利用Role实体进行插入")
    @ApiImplicitParam(name = "record", value = "管理员信息实体Role", required = true, dataType = "Role")
    @RequestMapping(value="/insert", method=RequestMethod.PUT)
	public int insert(@RequestBody Role record) {
		return roleService.insert(record);
	}

    @ApiOperation(value="选择添加Role", notes="利用Role实体进行参数选择性的插入")
    @ApiImplicitParam(name = "record", value = "管理员信息实体Role", required = true, dataType = "Role")
    @RequestMapping(value="/insertSelective", method=RequestMethod.PUT)
	public int insertSelective(@RequestBody Role record) {
		return roleService.insertSelective(record);
	}

    @ApiOperation(value="查询Role", notes="利用RoleExample实体进行查询Role集合")
    @ApiImplicitParam(name = "example", value = "管理员信息实体RoleExample", required = true, dataType = "RoleExample")
    @RequestMapping(value="/selectByExample", method=RequestMethod.POST)
	public List<Role> selectByExample(@RequestBody RoleExample example) {
		return roleService.selectByExample(example);
	}

    @ApiOperation(value="主键查询Role", notes="根据主键id查询Role")
    @RequestMapping(value="/selectByPrimaryKey", method=RequestMethod.POST)
	public Role selectByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return roleService.selectByPrimaryKey(id);
	}

    @ApiOperation(value="选择信息更新管理员信息信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "管理员信息实体", required = true, dataType = "Role"),
            @ApiImplicitParam(name = "example", value = "管理员信息查询实体", required = true, dataType = "RoleExample")
    })
    @RequestMapping(value="/updateByExampleSelective", method=RequestMethod.PUT)
	public int updateByExampleSelective(@RequestBody Role record, @RequestBody RoleExample example) {
		return roleService.updateByExampleSelective(record, example);
	}

    @ApiOperation(value="更新管理员信息信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "管理员信息实体", required = true, dataType = "Role"),
            @ApiImplicitParam(name = "example", value = "管理员信息查询实体", required = true, dataType = "RoleExample")
    })
    @RequestMapping(value="/updateByExample", method=RequestMethod.PUT)
	public int updateByExample(@RequestBody Role record, @RequestBody RoleExample example) {
		return roleService.updateByExample(record, example);
	}

    @ApiOperation(value="更新Role", notes="根据Role实体进行选择性的参数更新")
    @ApiImplicitParam(name = "record", value = "管理员信息实体Role", required = true, dataType = "Role")
    @RequestMapping(value="/updateByPrimaryKeySelective", method=RequestMethod.PUT)
	public int updateByPrimaryKeySelective(@RequestBody Role record) {
		return roleService.updateByPrimaryKeySelective(record);
	}

    @ApiOperation(value="更新Role", notes="根据Role实体进行更新")
    @ApiImplicitParam(name = "record", value = "管理员信息实体Role", required = true, dataType = "Role")
    @RequestMapping(value="/updateByPrimaryKey", method=RequestMethod.PUT)
	public int updateByPrimaryKey(@RequestBody Role record) {
		return roleService.updateByPrimaryKey(record);
	}
}

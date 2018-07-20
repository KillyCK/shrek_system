package com.shrek.supervisor.controller;

import com.shrek.supervisor.entity.Role;
import com.shrek.supervisor.entity.RoleExample;
import com.shrek.supervisor.service.RoleService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * controller - 角色
 * @author shrek
 * create date ：2018年6月2日 下午1:33:44
 */
@RestController
@RequestMapping(value="/role") 
@Api(value = "RoleController", tags = "Role相关的api")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@ApiOperation(value="统计role", notes="根据example统计role")
    @ApiImplicitParam(name = "example", value = "角色查询实体roleExample", required = true, dataType = "RoleExample")
    @RequestMapping(value="/countByExample", method=RequestMethod.POST)
	public long countByExample(@RequestBody RoleExample example) {
		return roleService.countByExample(example);
	}
    
    @ApiOperation(value="选择删除role", notes="根据example删除role")
    @ApiImplicitParam(name = "example", value = "角色查询实体roleExample", required = true, dataType = "RoleExample")
    @RequestMapping(value="/deleteByExample", method=RequestMethod.DELETE)
	public int deleteByExample(@RequestBody RoleExample example) {
		return roleService.deleteByExample(example);
	}

    @ApiOperation(value="主键删除role", notes="根据主键id删除role")
    @RequestMapping(value="/deleteByPrimaryKey", method=RequestMethod.DELETE)
	public int deleteByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return roleService.deleteByPrimaryKey(id);
	}

    @ApiOperation(value="添加role", notes="利用role实体进行插入")
    @ApiImplicitParam(name = "record", value = "角色实体role", required = true, dataType = "Role")
    @RequestMapping(value="/insert", method=RequestMethod.PUT)
	public int insert(@RequestBody Role record) {
		return roleService.insert(record);
	}

    @ApiOperation(value="选择添加role", notes="利用role实体进行参数选择性的插入")
    @ApiImplicitParam(name = "record", value = "角色实体role", required = true, dataType = "Role")
    @RequestMapping(value="/insertSelective", method=RequestMethod.PUT)
	public int insertSelective(@RequestBody Role record) {
		return roleService.insertSelective(record);
	}

    @ApiOperation(value="查询role", notes="利用roleExample实体进行查询role集合")
    @ApiImplicitParam(name = "example", value = "角色实体roleExample", required = true, dataType = "RoleExample")
    @RequestMapping(value="/selectByExample", method=RequestMethod.POST)
	public List<Role> selectByExample(@RequestBody RoleExample example) {
		return roleService.selectByExample(example);
	}

    @ApiOperation(value="主键查询role", notes="根据主键id查询role")
    @RequestMapping(value="/selectByPrimaryKey", method=RequestMethod.POST)
	public Role selectByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return roleService.selectByPrimaryKey(id);
	}

    @ApiOperation(value="选择信息更新角色信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "角色实体", required = true, dataType = "Role"),
            @ApiImplicitParam(name = "example", value = "角色查询实体", required = true, dataType = "RoleExample")
    })
    @RequestMapping(value="/updateByExampleSelective", method=RequestMethod.PUT)
	public int updateByExampleSelective(@RequestBody Role record, @RequestBody RoleExample example) {
		return roleService.updateByExampleSelective(record, example);
	}

    @ApiOperation(value="更新角色信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "角色实体", required = true, dataType = "Role"),
            @ApiImplicitParam(name = "example", value = "角色查询实体", required = true, dataType = "RoleExample")
    })
    @RequestMapping(value="/updateByExample", method=RequestMethod.PUT)
	public int updateByExample(@RequestBody Role record, @RequestBody RoleExample example) {
		return roleService.updateByExample(record, example);
	}

    @ApiOperation(value="更新role", notes="根据role实体进行选择性的参数更新")
    @ApiImplicitParam(name = "record", value = "角色实体role", required = true, dataType = "Role")
    @RequestMapping(value="/updateByPrimaryKeySelective", method=RequestMethod.PUT)
	public int updateByPrimaryKeySelective(@RequestBody Role record) {
		return roleService.updateByPrimaryKeySelective(record);
	}

    @ApiOperation(value="更新role", notes="根据role实体进行更新")
    @ApiImplicitParam(name = "record", value = "角色实体role", required = true, dataType = "Role")
    @RequestMapping(value="/updateByPrimaryKey", method=RequestMethod.PUT)
	public int updateByPrimaryKey(@RequestBody Role record) {
		return roleService.updateByPrimaryKey(record);
	}

}

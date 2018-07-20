package com.shrek.supervisor.controller;

import com.shrek.supervisor.entity.RolePermission;
import com.shrek.supervisor.entity.RolePermissionExample;
import com.shrek.supervisor.service.RolePermissionService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * controller -角色权限
 * @author shrek
 * create date ：2018年6月4日 上午12:12:06
 */
@RestController
@RequestMapping(value="/rolePermission") 
@Api(value = "RolePermissionController", tags = "RolePermission相关的api")
public class RolePermissionController {

	@Autowired
	private RolePermissionService rolePermissionService;

	@ApiOperation(value="统计rolePermission", notes="根据example统计rolePermission")
    @ApiImplicitParam(name = "example", value = "角色权限查询实体rolePermissionExample", required = true, dataType = "RolePermissionExample")
    @RequestMapping(value="/countByExample", method=RequestMethod.POST)
	public long countByExample(@RequestBody RolePermissionExample example) {
		return rolePermissionService.countByExample(example);
	}
    
    @ApiOperation(value="选择删除rolePermission", notes="根据example删除rolePermission")
    @ApiImplicitParam(name = "example", value = "角色权限查询实体rolePermissionExample", required = true, dataType = "RolePermissionExample")
    @RequestMapping(value="/deleteByExample", method=RequestMethod.DELETE)
	public int deleteByExample(@RequestBody RolePermissionExample example) {
		return rolePermissionService.deleteByExample(example);
	}

    @ApiOperation(value="主键删除rolePermission", notes="根据主键id删除rolePermission")
    @RequestMapping(value="/deleteByPrimaryKey", method=RequestMethod.DELETE)
	public int deleteByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return rolePermissionService.deleteByPrimaryKey(id);
	}

    @ApiOperation(value="添加rolePermission", notes="利用rolePermission实体进行插入")
    @ApiImplicitParam(name = "record", value = "角色权限实体rolePermission", required = true, dataType = "RolePermission")
    @RequestMapping(value="/insert", method=RequestMethod.PUT)
	public int insert(@RequestBody RolePermission record) {
		return rolePermissionService.insert(record);
	}

    @ApiOperation(value="选择添加rolePermission", notes="利用rolePermission实体进行参数选择性的插入")
    @ApiImplicitParam(name = "record", value = "角色权限实体rolePermission", required = true, dataType = "RolePermission")
    @RequestMapping(value="/insertSelective", method=RequestMethod.PUT)
	public int insertSelective(@RequestBody RolePermission record) {
		return rolePermissionService.insertSelective(record);
	}

    @ApiOperation(value="查询rolePermission", notes="利用rolePermissionExample实体进行查询rolePermission集合")
    @ApiImplicitParam(name = "example", value = "角色权限实体rolePermissionExample", required = true, dataType = "RolePermissionExample")
    @RequestMapping(value="/selectByExample", method=RequestMethod.POST)
	public List<RolePermission> selectByExample(@RequestBody RolePermissionExample example) {
		return rolePermissionService.selectByExample(example);
	}

    @ApiOperation(value="主键查询rolePermission", notes="根据主键id查询rolePermission")
    @RequestMapping(value="/selectByPrimaryKey", method=RequestMethod.POST)
	public RolePermission selectByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return rolePermissionService.selectByPrimaryKey(id);
	}

    @ApiOperation(value="选择信息更新角色权限信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "角色权限实体", required = true, dataType = "RolePermission"),
            @ApiImplicitParam(name = "example", value = "角色权限查询实体", required = true, dataType = "RolePermissionExample")
    })
    @RequestMapping(value="/updateByExampleSelective", method=RequestMethod.PUT)
	public int updateByExampleSelective(@RequestBody RolePermission record, @RequestBody RolePermissionExample example) {
		return rolePermissionService.updateByExampleSelective(record, example);
	}

    @ApiOperation(value="更新角色权限信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "角色权限实体", required = true, dataType = "RolePermission"),
            @ApiImplicitParam(name = "example", value = "角色权限查询实体", required = true, dataType = "RolePermissionExample")
    })
    @RequestMapping(value="/updateByExample", method=RequestMethod.PUT)
	public int updateByExample(@RequestBody RolePermission record, @RequestBody RolePermissionExample example) {
		return rolePermissionService.updateByExample(record, example);
	}

    @ApiOperation(value="更新rolePermission", notes="根据rolePermission实体进行选择性的参数更新")
    @ApiImplicitParam(name = "record", value = "角色权限实体rolePermission", required = true, dataType = "RolePermission")
    @RequestMapping(value="/updateByPrimaryKeySelective", method=RequestMethod.PUT)
	public int updateByPrimaryKeySelective(@RequestBody RolePermission record) {
		return rolePermissionService.updateByPrimaryKeySelective(record);
	}

    @ApiOperation(value="更新rolePermission", notes="根据rolePermission实体进行更新")
    @ApiImplicitParam(name = "record", value = "角色权限实体rolePermission", required = true, dataType = "RolePermission")
    @RequestMapping(value="/updateByPrimaryKey", method=RequestMethod.PUT)
	public int updateByPrimaryKey(@RequestBody RolePermission record) {
		return rolePermissionService.updateByPrimaryKey(record);
	}

}

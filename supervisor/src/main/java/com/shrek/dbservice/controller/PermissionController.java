package com.shrek.dbservice.controller;

import com.shrek.dbservice.service.PermissionService;
import com.shrek.dbservice.entity.Permission;
import com.shrek.dbservice.entity.PermissionExample;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * controller - 权限
 * @author shrek
 * create date ：2018年6月4日 上午12:10:27
 */
@RestController
@RequestMapping(value="/permisssion") 
@Api(value = "PermissionController", tags = "Permission相关的api")
public class PermissionController {

	@Autowired
	private PermissionService permissionService;

	@ApiOperation(value="统计permission", notes="根据example统计permission")
    @ApiImplicitParam(name = "example", value = "权限查询实体permissionExample", required = true, dataType = "PermissionExample")
    @RequestMapping(value="/countByExample", method=RequestMethod.POST)
	public long countByExample(@RequestBody PermissionExample example) {
		return permissionService.countByExample(example);
	}
    
    @ApiOperation(value="选择删除permission", notes="根据example删除permission")
    @ApiImplicitParam(name = "example", value = "权限查询实体permissionExample", required = true, dataType = "PermissionExample")
    @RequestMapping(value="/deleteByExample", method=RequestMethod.DELETE)
	public int deleteByExample(@RequestBody PermissionExample example) {
		return permissionService.deleteByExample(example);
	}

    @ApiOperation(value="主键删除permission", notes="根据主键id删除permission")
    @RequestMapping(value="/deleteByPrimaryKey", method=RequestMethod.DELETE)
	public int deleteByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return permissionService.deleteByPrimaryKey(id);
	}

    @ApiOperation(value="添加permission", notes="利用permission实体进行插入")
    @ApiImplicitParam(name = "record", value = "权限实体permission", required = true, dataType = "Permission")
    @RequestMapping(value="/insert", method=RequestMethod.PUT)
	public int insert(@RequestBody Permission record) {
		return permissionService.insert(record);
	}

    @ApiOperation(value="选择添加permission", notes="利用permission实体进行参数选择性的插入")
    @ApiImplicitParam(name = "record", value = "权限实体permission", required = true, dataType = "Permission")
    @RequestMapping(value="/insertSelective", method=RequestMethod.PUT)
	public int insertSelective(@RequestBody Permission record) {
		return permissionService.insertSelective(record);
	}

    @ApiOperation(value="查询permission", notes="利用permissionExample实体进行查询permission集合")
    @ApiImplicitParam(name = "example", value = "权限实体permissionExample", required = true, dataType = "PermissionExample")
    @RequestMapping(value="/selectByExample", method=RequestMethod.POST)
	public List<Permission> selectByExample(@RequestBody PermissionExample example) {
		return permissionService.selectByExample(example);
	}

    @ApiOperation(value="主键查询permission", notes="根据主键id查询permission")
    @RequestMapping(value="/selectByPrimaryKey", method=RequestMethod.POST)
	public Permission selectByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return permissionService.selectByPrimaryKey(id);
	}

    @ApiOperation(value="选择信息更新权限信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "权限实体", required = true, dataType = "Permission"),
            @ApiImplicitParam(name = "example", value = "权限查询实体", required = true, dataType = "PermissionExample")
    })
    @RequestMapping(value="/updateByExampleSelective", method=RequestMethod.PUT)
	public int updateByExampleSelective(@RequestBody Permission record, @RequestBody PermissionExample example) {
		return permissionService.updateByExampleSelective(record, example);
	}

    @ApiOperation(value="更新权限信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "权限实体", required = true, dataType = "Permission"),
            @ApiImplicitParam(name = "example", value = "权限查询实体", required = true, dataType = "PermissionExample")
    })
    @RequestMapping(value="/updateByExample", method=RequestMethod.PUT)
	public int updateByExample(@RequestBody Permission record, @RequestBody PermissionExample example) {
		return permissionService.updateByExample(record, example);
	}

    @ApiOperation(value="更新permission", notes="根据permission实体进行选择性的参数更新")
    @ApiImplicitParam(name = "record", value = "权限实体permission", required = true, dataType = "Permission")
    @RequestMapping(value="/updateByPrimaryKeySelective", method=RequestMethod.PUT)
	public int updateByPrimaryKeySelective(@RequestBody Permission record) {
		return permissionService.updateByPrimaryKeySelective(record);
	}

    @ApiOperation(value="更新permission", notes="根据permission实体进行更新")
    @ApiImplicitParam(name = "record", value = "权限实体permission", required = true, dataType = "Permission")
    @RequestMapping(value="/updateByPrimaryKey", method=RequestMethod.PUT)
	public int updateByPrimaryKey(@RequestBody Permission record) {
		return permissionService.updateByPrimaryKey(record);
	}
}

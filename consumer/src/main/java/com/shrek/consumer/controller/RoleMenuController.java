package com.shrek.consumer.controller;

import com.shrek.consumer.entity.RoleMenu;
import com.shrek.consumer.entity.RoleMenuExample;
import com.shrek.consumer.service.RoleMenuService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * controller - 角色菜单
 * @author shrek
 * create date ：2018年6月2日 下午1:38:42
 */
@RestController
@RequestMapping(value="/roleMenu") 
@Api(value = "RoleMenuController", tags = "RoleMenu相关的api")
public class RoleMenuController {

	@Autowired
	private RoleMenuService roleMenuService;

	@ApiOperation(value="统计roleMenu", notes="根据example统计roleMenu")
    @ApiImplicitParam(name = "example", value = "角色菜单查询实体roleMenuExample", required = true, dataType = "RoleMenuExample")
    @RequestMapping(value="/countByExample", method=RequestMethod.POST)
	@PreAuthorize("hasAuthority('roleMenu:countByExample')")
	public long countByExample(@RequestBody RoleMenuExample example) {
		return roleMenuService.countByExample(example);
	}
    
    @ApiOperation(value="选择删除roleMenu", notes="根据example删除roleMenu")
    @ApiImplicitParam(name = "example", value = "角色菜单查询实体roleMenuExample", required = true, dataType = "RoleMenuExample")
    @RequestMapping(value="/deleteByExample", method=RequestMethod.DELETE)
	@PreAuthorize("hasAuthority('roleMenu:deleteByExample')")
	public int deleteByExample(@RequestBody RoleMenuExample example) {
		return roleMenuService.deleteByExample(example);
	}

    @ApiOperation(value="主键删除roleMenu", notes="根据主键id删除roleMenu")
    @RequestMapping(value="/deleteByPrimaryKey", method=RequestMethod.DELETE)
	@PreAuthorize("hasAuthority('roleMenu:deleteByPrimaryKey')")
	public int deleteByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return roleMenuService.deleteByPrimaryKey(id);
	}

    @ApiOperation(value="添加roleMenu", notes="利用roleMenu实体进行插入")
    @ApiImplicitParam(name = "record", value = "角色菜单实体roleMenu", required = true, dataType = "RoleMenu")
    @RequestMapping(value="/insert", method=RequestMethod.PUT)
	@PreAuthorize("hasAuthority('roleMenu:insert')")
	public int insert(@RequestBody RoleMenu record) {
		return roleMenuService.insert(record);
	}

    @ApiOperation(value="选择添加roleMenu", notes="利用roleMenu实体进行参数选择性的插入")
    @ApiImplicitParam(name = "record", value = "角色菜单实体roleMenu", required = true, dataType = "RoleMenu")
    @RequestMapping(value="/insertSelective", method=RequestMethod.PUT)
	@PreAuthorize("hasAuthority('roleMenu:insertSelective')")
	public int insertSelective(@RequestBody RoleMenu record) {
		return roleMenuService.insertSelective(record);
	}

    @ApiOperation(value="查询roleMenu", notes="利用roleMenuExample实体进行查询roleMenu集合")
    @ApiImplicitParam(name = "example", value = "角色菜单实体roleMenuExample", required = true, dataType = "RoleMenuExample")
    @RequestMapping(value="/selectByExample", method=RequestMethod.POST)
	@PreAuthorize("hasAuthority('roleMenu:selectByExample')")
	public List<RoleMenu> selectByExample(@RequestBody RoleMenuExample example) {
		return roleMenuService.selectByExample(example);
	}

    @ApiOperation(value="主键查询roleMenu", notes="根据主键id查询roleMenu")
    @RequestMapping(value="/selectByPrimaryKey", method=RequestMethod.POST)
	@PreAuthorize("hasAuthority('roleMenu:selectByPrimaryKey')")
	public RoleMenu selectByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return roleMenuService.selectByPrimaryKey(id);
	}

    @ApiOperation(value="选择信息更新角色菜单信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "角色菜单实体", required = true, dataType = "RoleMenu"),
            @ApiImplicitParam(name = "example", value = "角色菜单查询实体", required = true, dataType = "RoleMenuExample")
    })
    @RequestMapping(value="/updateByExampleSelective", method=RequestMethod.PUT)
	@PreAuthorize("hasAuthority('roleMenu:updateByExampleSelective')")
	public int updateByExampleSelective(@RequestBody RoleMenu record, @RequestBody RoleMenuExample example) {
		return roleMenuService.updateByExampleSelective(record, example);
	}

    @ApiOperation(value="更新角色菜单信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "角色菜单实体", required = true, dataType = "RoleMenu"),
            @ApiImplicitParam(name = "example", value = "角色菜单查询实体", required = true, dataType = "RoleMenuExample")
    })
    @RequestMapping(value="/updateByExample", method=RequestMethod.PUT)
	@PreAuthorize("hasAuthority('roleMenu:updateByExample')")
	public int updateByExample(@RequestBody RoleMenu record, @RequestBody RoleMenuExample example) {
		return roleMenuService.updateByExample(record, example);
	}

    @ApiOperation(value="更新roleMenu", notes="根据roleMenu实体进行选择性的参数更新")
    @ApiImplicitParam(name = "record", value = "角色菜单实体roleMenu", required = true, dataType = "RoleMenu")
    @RequestMapping(value="/updateByPrimaryKeySelective", method=RequestMethod.PUT)
	@PreAuthorize("hasAuthority('roleMenu:updateByPrimaryKeySelective')")
	public int updateByPrimaryKeySelective(@RequestBody RoleMenu record) {
		return roleMenuService.updateByPrimaryKeySelective(record);
	}

    @ApiOperation(value="更新roleMenu", notes="根据roleMenu实体进行更新")
    @ApiImplicitParam(name = "record", value = "角色菜单实体roleMenu", required = true, dataType = "RoleMenu")
    @RequestMapping(value="/updateByPrimaryKey", method=RequestMethod.PUT)
	@PreAuthorize("hasAuthority('roleMenu:updateByPrimaryKey')")
	public int updateByPrimaryKey(@RequestBody RoleMenu record) {
		return roleMenuService.updateByPrimaryKey(record);
	}

}

package com.shrek.dbservice.controller;

import com.shrek.dbservice.service.MenuService;
import com.shrek.dbservice.entity.Menu;
import com.shrek.dbservice.entity.MenuExample;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * controller - 菜单
 * @author shrek
 * create date ：2018年6月2日 下午1:33:05
 */
@RestController
@RequestMapping(value="/menu") 
@Api(value = "MenuController", tags = "Menu相关的api")
public class MenuController {
	
	@Autowired
	private MenuService menuService;

	@ApiOperation(value="统计menu", notes="根据example统计menu")
    @ApiImplicitParam(name = "example", value = "菜单查询实体menuExample", required = true, dataType = "MenuExample")
    @RequestMapping(value="/countByExample", method=RequestMethod.POST)
	public long countByExample(@RequestBody MenuExample example) {
		return menuService.countByExample(example);
	}
    
    @ApiOperation(value="选择删除menu", notes="根据example删除menu")
    @ApiImplicitParam(name = "example", value = "菜单查询实体menuExample", required = true, dataType = "MenuExample")
    @RequestMapping(value="/deleteByExample", method=RequestMethod.DELETE)
	public int deleteByExample(@RequestBody MenuExample example) {
		return menuService.deleteByExample(example);
	}

    @ApiOperation(value="主键删除menu", notes="根据主键id删除menu")
    @RequestMapping(value="/deleteByPrimaryKey", method=RequestMethod.DELETE)
	public int deleteByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return menuService.deleteByPrimaryKey(id);
	}

    @ApiOperation(value="添加menu", notes="利用menu实体进行插入")
    @ApiImplicitParam(name = "record", value = "菜单实体menu", required = true, dataType = "Menu")
    @RequestMapping(value="/insert", method=RequestMethod.PUT)
	public int insert(@RequestBody Menu record) {
		return menuService.insert(record);
	}

    @ApiOperation(value="选择添加menu", notes="利用menu实体进行参数选择性的插入")
    @ApiImplicitParam(name = "record", value = "菜单实体menu", required = true, dataType = "Menu")
    @RequestMapping(value="/insertSelective", method=RequestMethod.PUT)
	public int insertSelective(@RequestBody Menu record) {
		return menuService.insertSelective(record);
	}

    @ApiOperation(value="查询menu", notes="利用menuExample实体进行查询menu集合")
    @ApiImplicitParam(name = "example", value = "菜单实体menuExample", required = true, dataType = "MenuExample")
    @RequestMapping(value="/selectByExample", method=RequestMethod.POST)
	public List<Menu> selectByExample(@RequestBody MenuExample example) {
		return menuService.selectByExample(example);
	}

    @ApiOperation(value="主键查询menu", notes="根据主键id查询menu")
    @RequestMapping(value="/selectByPrimaryKey", method=RequestMethod.POST)
	public Menu selectByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return menuService.selectByPrimaryKey(id);
	}

    @ApiOperation(value="选择信息更新菜单信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "菜单实体", required = true, dataType = "Menu"),
            @ApiImplicitParam(name = "example", value = "菜单查询实体", required = true, dataType = "MenuExample")
    })
    @RequestMapping(value="/updateByExampleSelective", method=RequestMethod.PUT)
	public int updateByExampleSelective(@RequestBody Menu record, @RequestBody MenuExample example) {
		return menuService.updateByExampleSelective(record, example);
	}

    @ApiOperation(value="更新菜单信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "菜单实体", required = true, dataType = "Menu"),
            @ApiImplicitParam(name = "example", value = "菜单查询实体", required = true, dataType = "MenuExample")
    })
    @RequestMapping(value="/updateByExample", method=RequestMethod.PUT)
	public int updateByExample(@RequestBody Menu record, @RequestBody MenuExample example) {
		return menuService.updateByExample(record, example);
	}

    @ApiOperation(value="更新menu", notes="根据menu实体进行选择性的参数更新")
    @ApiImplicitParam(name = "record", value = "菜单实体menu", required = true, dataType = "Menu")
    @RequestMapping(value="/updateByPrimaryKeySelective", method=RequestMethod.PUT)
	public int updateByPrimaryKeySelective(@RequestBody Menu record) {
		return menuService.updateByPrimaryKeySelective(record);
	}

    @ApiOperation(value="更新menu", notes="根据menu实体进行更新")
    @ApiImplicitParam(name = "record", value = "菜单实体menu", required = true, dataType = "Menu")
    @RequestMapping(value="/updateByPrimaryKey", method=RequestMethod.PUT)
	public int updateByPrimaryKey(@RequestBody Menu record) {
		return menuService.updateByPrimaryKey(record);
	}

}

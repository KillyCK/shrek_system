package com.shrek.consumer.controller;

import com.shrek.consumer.entity.Department;
import com.shrek.consumer.entity.DepartmentExample;
import com.shrek.consumer.service.DepartmentService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * controller - 部门
 * @author shrek
 * create date ：2018年6月2日 下午1:32:29
 */
@RestController
@RequestMapping(value="/department") 
@Api(value = "DepartmentController", tags = "Department相关的api")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

    @ApiOperation(value="统计Department", notes="根据example统计Department")
    @ApiImplicitParam(name = "example", value = "部门查询实体DepartmentExample", required = true, dataType = "DepartmentExample")
    @RequestMapping(value="/countByExample", method=RequestMethod.POST)
	@PreAuthorize("hasAuthority('department:countByExample')")
	public long countByExample(@RequestBody DepartmentExample example) {
		return departmentService.countByExample(example);
	}
    
    @ApiOperation(value="选择删除Department", notes="根据example删除Department")
    @ApiImplicitParam(name = "example", value = "部门查询实体DepartmentExample", required = true, dataType = "DepartmentExample")
    @RequestMapping(value="/deleteByExample", method=RequestMethod.DELETE)
	@PreAuthorize("hasAuthority('department:deleteByExample')")
	public int deleteByExample(@RequestBody DepartmentExample example) {
		return departmentService.deleteByExample(example);
	}

    @ApiOperation(value="主键删除Department", notes="根据主键id删除Department")
    @RequestMapping(value="/deleteByPrimaryKey", method=RequestMethod.DELETE)
	@PreAuthorize("hasAuthority('department:deleteByPrimaryKey')")
	public int deleteByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return departmentService.deleteByPrimaryKey(id);
	}

    @ApiOperation(value="添加Department", notes="利用Department实体进行插入")
    @ApiImplicitParam(name = "record", value = "部门实体Department", required = true, dataType = "Department")
    @RequestMapping(value="/insert", method=RequestMethod.PUT)
	@PreAuthorize("hasAuthority('department:insert')")
	public int insert(@RequestBody Department record) {
		return departmentService.insert(record);
	}

    @ApiOperation(value="选择添加Department", notes="利用Department实体进行参数选择性的插入")
    @ApiImplicitParam(name = "record", value = "部门实体Department", required = true, dataType = "Department")
    @RequestMapping(value="/insertSelective", method=RequestMethod.PUT)
	@PreAuthorize("hasAuthority('department:insertSelective')")
	public int insertSelective(@RequestBody Department record) {
		return departmentService.insertSelective(record);
	}

    @ApiOperation(value="查询Department", notes="利用DepartmentExample实体进行查询Department集合")
    @ApiImplicitParam(name = "example", value = "部门实体DepartmentExample", required = true, dataType = "DepartmentExample")
    @RequestMapping(value="/selectByExample", method=RequestMethod.POST)
	@PreAuthorize("hasAuthority('department:selectByExample')")
	public List<Department> selectByExample(@RequestBody DepartmentExample example) {
		return departmentService.selectByExample(example);
	}

    @ApiOperation(value="主键查询Department", notes="根据主键id查询Department")
    @RequestMapping(value="/selectByPrimaryKey", method=RequestMethod.POST)
	@PreAuthorize("hasAuthority('department:selectByPrimaryKey')")
	public Department selectByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return departmentService.selectByPrimaryKey(id);
	}

    @ApiOperation(value="选择信息更新部门信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "部门实体", required = true, dataType = "Department"),
            @ApiImplicitParam(name = "example", value = "部门查询实体", required = true, dataType = "DepartmentExample")
    })
    @RequestMapping(value="/updateByExampleSelective", method=RequestMethod.PUT)
	@PreAuthorize("hasAuthority('department:updateByExampleSelective')")
	public int updateByExampleSelective(@RequestBody Department record, @RequestBody DepartmentExample example) {
		return departmentService.updateByExampleSelective(record, example);
	}

    @ApiOperation(value="更新部门信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "部门实体", required = true, dataType = "Department"),
            @ApiImplicitParam(name = "example", value = "部门查询实体", required = true, dataType = "DepartmentExample")
    })
    @RequestMapping(value="/updateByExample", method=RequestMethod.PUT)
	@PreAuthorize("hasAuthority('department:updateByExample')")
	public int updateByExample(@RequestBody Department record, @RequestBody DepartmentExample example) {
		return departmentService.updateByExample(record, example);
	}

    @ApiOperation(value="更新Department", notes="根据Department实体进行选择性的参数更新")
    @ApiImplicitParam(name = "record", value = "部门实体Department", required = true, dataType = "Department")
    @RequestMapping(value="/updateByPrimaryKeySelective", method=RequestMethod.PUT)
	@PreAuthorize("hasAuthority('department:updateByPrimaryKeySelective')")
	public int updateByPrimaryKeySelective(@RequestBody Department record) {
		return departmentService.updateByPrimaryKeySelective(record);
	}

    @ApiOperation(value="更新Department", notes="根据Department实体进行更新")
    @ApiImplicitParam(name = "record", value = "部门实体Department", required = true, dataType = "Department")
    @RequestMapping(value="/updateByPrimaryKey", method=RequestMethod.PUT)
	@PreAuthorize("hasAuthority('department:updateByPrimaryKey')")
	public int updateByPrimaryKey(@RequestBody Department record) {
		return departmentService.updateByPrimaryKey(record);
	}

}

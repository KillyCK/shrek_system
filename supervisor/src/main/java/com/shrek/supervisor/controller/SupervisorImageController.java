package com.shrek.supervisor.controller;

import com.shrek.supervisor.entity.SupervisorImage;
import com.shrek.supervisor.entity.SupervisorImageExample;
import com.shrek.supervisor.service.SupervisorImageService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * controller － 管理员图片
 * @author shrek
 * create date ：2018年6月2日 下午1:41:32
 */
@RestController
@RequestMapping(value="/supervisorImage") 
@Api(value = "SupervisorImageController", tags = "supervisorImage相关的api")
public class SupervisorImageController {
	
	@Autowired
	private SupervisorImageService supervisorImageService;
	
	
	@ApiOperation(value="统计supervisorImage", notes="根据example统计supervisorImage")
    @ApiImplicitParam(name = "example", value = "管理员图片查询实体supervisorImageExample", required = true, dataType = "SupervisorImageExample")
    @RequestMapping(value="/countByExample", method=RequestMethod.POST)
	public long countByExample(@RequestBody SupervisorImageExample example) {
		return supervisorImageService.countByExample(example);
	}
    
    @ApiOperation(value="选择删除supervisorImage", notes="根据example删除supervisorImage")
    @ApiImplicitParam(name = "example", value = "管理员图片查询实体supervisorImageExample", required = true, dataType = "SupervisorImageExample")
    @RequestMapping(value="/deleteByExample", method=RequestMethod.DELETE)
	public int deleteByExample(@RequestBody SupervisorImageExample example) {
		return supervisorImageService.deleteByExample(example);
	}

    @ApiOperation(value="主键删除supervisorImage", notes="根据主键id删除supervisorImage")
    @RequestMapping(value="/deleteByPrimaryKey", method=RequestMethod.DELETE)
	public int deleteByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return supervisorImageService.deleteByPrimaryKey(id);
	}

    @ApiOperation(value="添加supervisorImage", notes="利用supervisorImage实体进行插入")
    @ApiImplicitParam(name = "record", value = "管理员图片实体supervisorImage", required = true, dataType = "SupervisorImage")
    @RequestMapping(value="/insert", method=RequestMethod.PUT)
	public int insert(@RequestBody SupervisorImage record) {
		return supervisorImageService.insert(record);
	}

    @ApiOperation(value="选择添加supervisorImage", notes="利用supervisorImage实体进行参数选择性的插入")
    @ApiImplicitParam(name = "record", value = "管理员图片实体supervisorImage", required = true, dataType = "SupervisorImage")
    @RequestMapping(value="/insertSelective", method=RequestMethod.PUT)
	public int insertSelective(@RequestBody SupervisorImage record) {
		return supervisorImageService.insertSelective(record);
	}

    @ApiOperation(value="查询supervisorImage", notes="利用supervisorImageExample实体进行查询supervisorImage集合")
    @ApiImplicitParam(name = "example", value = "管理员图片实体supervisorImageExample", required = true, dataType = "SupervisorImageExample")
    @RequestMapping(value="/selectByExample", method=RequestMethod.POST)
	public List<SupervisorImage> selectByExample(@RequestBody SupervisorImageExample example) {
		return supervisorImageService.selectByExample(example);
	}

    @ApiOperation(value="主键查询supervisorImage", notes="根据主键id查询supervisorImage")
    @RequestMapping(value="/selectByPrimaryKey", method=RequestMethod.POST)
	public SupervisorImage selectByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return supervisorImageService.selectByPrimaryKey(id);
	}

    @ApiOperation(value="选择信息更新管理员图片信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "管理员图片实体", required = true, dataType = "SupervisorImage"),
            @ApiImplicitParam(name = "example", value = "管理员图片查询实体", required = true, dataType = "SupervisorImageExample")
    })
    @RequestMapping(value="/updateByExampleSelective", method=RequestMethod.PUT)
	public int updateByExampleSelective(@RequestBody SupervisorImage record, @RequestBody SupervisorImageExample example) {
		return supervisorImageService.updateByExampleSelective(record, example);
	}

    @ApiOperation(value="更新管理员图片信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "管理员图片实体", required = true, dataType = "SupervisorImage"),
            @ApiImplicitParam(name = "example", value = "管理员图片查询实体", required = true, dataType = "SupervisorImageExample")
    })
    @RequestMapping(value="/updateByExample", method=RequestMethod.PUT)
	public int updateByExample(@RequestBody SupervisorImage record, @RequestBody SupervisorImageExample example) {
		return supervisorImageService.updateByExample(record, example);
	}

    @ApiOperation(value="更新supervisorImage", notes="根据supervisorImage实体进行选择性的参数更新")
    @ApiImplicitParam(name = "record", value = "管理员图片实体supervisorImage", required = true, dataType = "SupervisorImage")
    @RequestMapping(value="/updateByPrimaryKeySelective", method=RequestMethod.PUT)
	public int updateByPrimaryKeySelective(@RequestBody SupervisorImage record) {
		return supervisorImageService.updateByPrimaryKeySelective(record);
	}

    @ApiOperation(value="更新supervisorImage", notes="根据supervisorImage实体进行更新")
    @ApiImplicitParam(name = "record", value = "管理员图片实体supervisorImage", required = true, dataType = "SupervisorImage")
    @RequestMapping(value="/updateByPrimaryKey", method=RequestMethod.PUT)
	public int updateByPrimaryKey(@RequestBody SupervisorImage record) {
		return supervisorImageService.updateByPrimaryKey(record);
	}
}

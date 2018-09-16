package com.shrek.consumer.controller;

import com.shrek.consumer.entity.Position;
import com.shrek.consumer.entity.PositionExample;
import com.shrek.consumer.service.PositionService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * controller - 职位
 * @author shrek
 * create date ：2018年6月2日 下午1:33:44
 */
@RestController
@RequestMapping(value="/position")
@Api(value = "PositionController", tags = "Position相关的api")
public class PositionController {

	@Autowired
	private PositionService positionService;

	@ApiOperation(value="统计Position", notes="根据example统计Position")
    @ApiImplicitParam(name = "example", value = "职位查询实体PositionExample", required = true, dataType = "PositionExample")
    @RequestMapping(value="/countByExample", method=RequestMethod.POST)
	public long countByExample(@RequestBody PositionExample example) {
		return positionService.countByExample(example);
	}
    
    @ApiOperation(value="选择删除Position", notes="根据example删除Position")
    @ApiImplicitParam(name = "example", value = "职位查询实体PositionExample", required = true, dataType = "PositionExample")
    @RequestMapping(value="/deleteByExample", method=RequestMethod.DELETE)
	public int deleteByExample(@RequestBody PositionExample example) {
		return positionService.deleteByExample(example);
	}

    @ApiOperation(value="主键删除Position", notes="根据主键id删除Position")
    @RequestMapping(value="/deleteByPrimaryKey", method=RequestMethod.DELETE)
	public int deleteByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return positionService.deleteByPrimaryKey(id);
	}

    @ApiOperation(value="添加Position", notes="利用Position实体进行插入")
    @ApiImplicitParam(name = "record", value = "职位实体Position", required = true, dataType = "Position")
    @RequestMapping(value="/insert", method=RequestMethod.PUT)
	public int insert(@RequestBody Position record) {
		return positionService.insert(record);
	}

    @ApiOperation(value="选择添加Position", notes="利用Position实体进行参数选择性的插入")
    @ApiImplicitParam(name = "record", value = "职位实体Position", required = true, dataType = "Position")
    @RequestMapping(value="/insertSelective", method=RequestMethod.PUT)
	public int insertSelective(@RequestBody Position record) {
		return positionService.insertSelective(record);
	}

    @ApiOperation(value="查询Position", notes="利用PositionExample实体进行查询Position集合")
    @ApiImplicitParam(name = "example", value = "职位实体PositionExample", required = true, dataType = "PositionExample")
    @RequestMapping(value="/selectByExample", method=RequestMethod.POST)
	public List<Position> selectByExample(@RequestBody PositionExample example) {
		return positionService.selectByExample(example);
	}

    @ApiOperation(value="主键查询Position", notes="根据主键id查询Position")
    @RequestMapping(value="/selectByPrimaryKey", method=RequestMethod.POST)
	public Position selectByPrimaryKey(@ApiParam("主键id") @RequestParam Integer id) {
		return positionService.selectByPrimaryKey(id);
	}

    @ApiOperation(value="选择信息更新职位信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "职位实体", required = true, dataType = "Position"),
            @ApiImplicitParam(name = "example", value = "职位查询实体", required = true, dataType = "PositionExample")
    })
    @RequestMapping(value="/updateByExampleSelective", method=RequestMethod.PUT)
	public int updateByExampleSelective(@RequestBody Position record, @RequestBody PositionExample example) {
		return positionService.updateByExampleSelective(record, example);
	}

    @ApiOperation(value="更新职位信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "职位实体", required = true, dataType = "Position"),
            @ApiImplicitParam(name = "example", value = "职位查询实体", required = true, dataType = "PositionExample")
    })
    @RequestMapping(value="/updateByExample", method=RequestMethod.PUT)
	public int updateByExample(@RequestBody Position record, @RequestBody PositionExample example) {
		return positionService.updateByExample(record, example);
	}

    @ApiOperation(value="更新Position", notes="根据Position实体进行选择性的参数更新")
    @ApiImplicitParam(name = "record", value = "职位实体Position", required = true, dataType = "Position")
    @RequestMapping(value="/updateByPrimaryKeySelective", method=RequestMethod.PUT)
	public int updateByPrimaryKeySelective(@RequestBody Position record) {
		return positionService.updateByPrimaryKeySelective(record);
	}

    @ApiOperation(value="更新Position", notes="根据Position实体进行更新")
    @ApiImplicitParam(name = "record", value = "职位实体Position", required = true, dataType = "Position")
    @RequestMapping(value="/updateByPrimaryKey", method=RequestMethod.PUT)
	public int updateByPrimaryKey(@RequestBody Position record) {
		return positionService.updateByPrimaryKey(record);
	}

}

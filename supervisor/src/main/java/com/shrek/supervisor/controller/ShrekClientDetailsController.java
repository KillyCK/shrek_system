package com.shrek.supervisor.controller;

import com.shrek.supervisor.entity.ShrekClientDetails;
import com.shrek.supervisor.entity.ShrekClientDetailsExample;
import com.shrek.supervisor.service.ShrekClientDetailsService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * controller - 客户端详情
 * @author shrek
 * create date ：2018年6月2日 下午1:32:29
 */
@RestController
@RequestMapping(value="/shrekClientDetails")
@Api(value = "ShrekClientDetailsController", tags = "ShrekClientDetails相关的api")
public class ShrekClientDetailsController {

    @Autowired
    private ShrekClientDetailsService shrekClientDetailsService;

    @ApiOperation(value="统计客户端详情", notes="根据example统计客户端")
    @ApiImplicitParam(name = "example", value = "查询实体ShrekClientDetailsExample", required = true, dataType = "ShrekClientDetailsExample")
    @RequestMapping(value="/countByExample", method= RequestMethod.POST)
    public long countByExample(@RequestBody ShrekClientDetailsExample example) {
        return shrekClientDetailsService.countByExample(example);
    }

    @ApiOperation(value="选择删除ShrekClientDetails", notes="根据example删除ShrekClientDetails")
    @ApiImplicitParam(name = "example", value = "查询实体ShrekClientDetails", required = true, dataType = "ShrekClientDetailsExample")
    @RequestMapping(value="/deleteByExample", method=RequestMethod.DELETE)
    public int deleteByExample(@RequestBody ShrekClientDetailsExample example) {
        return shrekClientDetailsService.deleteByExample(example);
    }

    @ApiOperation(value="主键删除ShrekClientDetails", notes="根据主键id删除ShrekClientDetails")
    @RequestMapping(value="/deleteByPrimaryKey", method=RequestMethod.DELETE)
    public int deleteByPrimaryKey(@ApiParam("主键clientId") @RequestParam String clientId) {
        return shrekClientDetailsService.deleteByPrimaryKey(clientId);
    }

    @ApiOperation(value="添加ShrekClientDetails", notes="利用ShrekClientDetails实体进行插入")
    @ApiImplicitParam(name = "record", value = "实体ShrekClientDetails", required = true, dataType = "ShrekClientDetails")
    @RequestMapping(value="/insert", method=RequestMethod.PUT)
    public int insert(@RequestBody ShrekClientDetails record) {
        return shrekClientDetailsService.insert(record);
    }

    @ApiOperation(value="选择添加ShrekClientDetails", notes="利用ShrekClientDetails实体进行参数选择性的插入")
    @ApiImplicitParam(name = "record", value = "实体ShrekClientDetails", required = true, dataType = "ShrekClientDetails")
    @RequestMapping(value="/insertSelective", method=RequestMethod.PUT)
    public int insertSelective(@RequestBody ShrekClientDetails record) {
        return shrekClientDetailsService.insertSelective(record);
    }

    @ApiOperation(value="查询ShrekClientDetails", notes="利用ShrekClientDetailsExample实体进行查询ShrekClientDetails集合")
    @ApiImplicitParam(name = "example", value = "实体ShrekClientDetailsExample", required = true, dataType = "ShrekClientDetailsExample")
    @RequestMapping(value="/selectByExample", method=RequestMethod.POST)
    public List<ShrekClientDetails> selectByExample(@RequestBody ShrekClientDetailsExample example) {
        return shrekClientDetailsService.selectByExample(example);
    }

    @ApiOperation(value="主键查询ShrekClientDetails", notes="根据主键id查询ShrekClientDetails")
    @RequestMapping(value="/selectByPrimaryKey", method=RequestMethod.POST)
    public ShrekClientDetails selectByPrimaryKey(@ApiParam("主键clientId") @RequestParam String clientId) {
        return shrekClientDetailsService.selectByPrimaryKey(clientId);
    }

    @ApiOperation(value="选择信息更新客户端信息信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "客户端信息实体", required = true, dataType = "ShrekClientDetails"),
            @ApiImplicitParam(name = "example", value = "客户端信息查询实体", required = true, dataType = "ShrekClientDetailsExample")
    })
    @RequestMapping(value="/updateByExampleSelective", method=RequestMethod.PUT)
    public int updateByExampleSelective(@RequestBody ShrekClientDetails record, @RequestBody ShrekClientDetailsExample example) {
        return shrekClientDetailsService.updateByExampleSelective(record, example);
    }

    @ApiOperation(value="更新客户端信息信息", notes="根据example筛选要更新的实体，然后用record进行信息选择性的更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "record", value = "客户端信息实体", required = true, dataType = "ShrekClientDetails"),
            @ApiImplicitParam(name = "example", value = "客户端信息查询实体", required = true, dataType = "ShrekClientDetailsExample")
    })
    @RequestMapping(value="/updateByExample", method=RequestMethod.PUT)
    public int updateByExample(@RequestBody ShrekClientDetails record, @RequestBody ShrekClientDetailsExample example) {
        return shrekClientDetailsService.updateByExample(record, example);
    }

    @ApiOperation(value="更新ShrekClientDetails", notes="根据ShrekClientDetails实体进行选择性的参数更新")
    @ApiImplicitParam(name = "record", value = "客户端信息实体ShrekClientDetails", required = true, dataType = "ShrekClientDetails")
    @RequestMapping(value="/updateByPrimaryKeySelective", method=RequestMethod.PUT)
    public int updateByPrimaryKeySelective(@RequestBody ShrekClientDetails record) {
        return shrekClientDetailsService.updateByPrimaryKeySelective(record);
    }

    @ApiOperation(value="更新ShrekClientDetails", notes="根据ShrekClientDetails实体进行更新")
    @ApiImplicitParam(name = "record", value = "客户端信息实体ShrekClientDetails", required = true, dataType = "ShrekClientDetails")
    @RequestMapping(value="/updateByPrimaryKey", method=RequestMethod.PUT)
    public int updateByPrimaryKey(@RequestBody ShrekClientDetails record) {
        return shrekClientDetailsService.updateByPrimaryKey(record);
    }
}

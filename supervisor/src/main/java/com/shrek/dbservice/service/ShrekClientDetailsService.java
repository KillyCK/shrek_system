package com.shrek.dbservice.service;

import com.shrek.dbservice.entity.ShrekClientDetails;
import com.shrek.dbservice.entity.ShrekClientDetailsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * service － 客户端详情
 * @author shrek
 * create date ：2018年6月2日 上午9:59:29
 */
public interface ShrekClientDetailsService {

    long countByExample(ShrekClientDetailsExample example);

    int deleteByExample(ShrekClientDetailsExample example);

    int deleteByPrimaryKey(String clientId);

    int insert(ShrekClientDetails record);

    int insertSelective(ShrekClientDetails record);

    List<ShrekClientDetails> selectByExample(ShrekClientDetailsExample example);

    ShrekClientDetails selectByPrimaryKey(String clientId);

    int updateByExampleSelective(@Param("record") ShrekClientDetails record, @Param("example") ShrekClientDetailsExample example);

    int updateByExample(@Param("record") ShrekClientDetails record, @Param("example") ShrekClientDetailsExample example);

    int updateByPrimaryKeySelective(ShrekClientDetails record);

    int updateByPrimaryKey(ShrekClientDetails record);
}

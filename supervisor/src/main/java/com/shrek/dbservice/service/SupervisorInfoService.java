package com.shrek.dbservice.service;

import com.shrek.dbservice.entity.SupervisorInfo;
import com.shrek.dbservice.entity.SupervisorInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * service － 管理员信息
 * @author shrek
 * create date ：2018年6月2日 上午10:03:37
 */
public interface SupervisorInfoService {

    long countByExample(SupervisorInfoExample example);

    int deleteByExample(SupervisorInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupervisorInfo record);

    int insertSelective(SupervisorInfo record);

    List<SupervisorInfo> selectByExample(SupervisorInfoExample example);

    SupervisorInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupervisorInfo record, @Param("example") SupervisorInfoExample example);

    int updateByExample(@Param("record") SupervisorInfo record, @Param("example") SupervisorInfoExample example);

    int updateByPrimaryKeySelective(SupervisorInfo record);

    int updateByPrimaryKey(SupervisorInfo record);
}

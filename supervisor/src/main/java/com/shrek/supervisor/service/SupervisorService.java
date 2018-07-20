package com.shrek.supervisor.service;

import com.shrek.supervisor.entity.Supervisor;
import com.shrek.supervisor.entity.SupervisorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * service － 管理员
 * @author shrek
 * create date ：2018年6月1日 下午7:35:04
 */
public interface SupervisorService {
	
    long countByExample(SupervisorExample example);

    int deleteByExample(SupervisorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Supervisor record);

    int insertSelective(Supervisor record);

    List<Supervisor> selectByExample(SupervisorExample example);

    Supervisor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Supervisor record, @Param("example") SupervisorExample example);

    int updateByExample(@Param("record") Supervisor record, @Param("example") SupervisorExample example);

    int updateByPrimaryKeySelective(Supervisor record);

    int updateByPrimaryKey(Supervisor record);

}

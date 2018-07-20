package com.shrek.supervisor.service;

import com.shrek.supervisor.entity.Position;
import com.shrek.supervisor.entity.PositionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: shrek
 * @Date: 2018/7/17 8:37
 * @Description:
 */
public interface PositionService {

    long countByExample(PositionExample example);

    int deleteByExample(PositionExample example);

    int deleteByPrimaryKey(Integer positionId);

    int insert(Position record);

    int insertSelective(Position record);

    List<Position> selectByExample(PositionExample example);

    Position selectByPrimaryKey(Integer positionId);

    int updateByExampleSelective(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByExample(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
}

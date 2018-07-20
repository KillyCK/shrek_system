package com.shrek.supervisor.dao;

import com.shrek.supervisor.entity.ShrekClientDetails;
import com.shrek.supervisor.entity.ShrekClientDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShrekClientDetailsDao {
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
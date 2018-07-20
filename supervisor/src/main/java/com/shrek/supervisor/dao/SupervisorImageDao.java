package com.shrek.supervisor.dao;

import com.shrek.supervisor.entity.SupervisorImage;
import com.shrek.supervisor.entity.SupervisorImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupervisorImageDao {
    long countByExample(SupervisorImageExample example);

    int deleteByExample(SupervisorImageExample example);

    int deleteByPrimaryKey(Integer supervisorImageId);

    int insert(SupervisorImage record);

    int insertSelective(SupervisorImage record);

    List<SupervisorImage> selectByExample(SupervisorImageExample example);

    SupervisorImage selectByPrimaryKey(Integer supervisorImageId);

    int updateByExampleSelective(@Param("record") SupervisorImage record, @Param("example") SupervisorImageExample example);

    int updateByExample(@Param("record") SupervisorImage record, @Param("example") SupervisorImageExample example);

    int updateByPrimaryKeySelective(SupervisorImage record);

    int updateByPrimaryKey(SupervisorImage record);
}
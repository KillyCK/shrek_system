package com.shrek.dbservice.service;

import com.shrek.dbservice.entity.SupervisorImage;
import com.shrek.dbservice.entity.SupervisorImageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * service - 管理员图片
 * @author shrek
 * create date ：2018年6月2日 上午10:01:39
 */
public interface SupervisorImageService {

    long countByExample(SupervisorImageExample example);

    int deleteByExample(SupervisorImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupervisorImage record);

    int insertSelective(SupervisorImage record);

    List<SupervisorImage> selectByExample(SupervisorImageExample example);

    SupervisorImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupervisorImage record, @Param("example") SupervisorImageExample example);

    int updateByExample(@Param("record") SupervisorImage record, @Param("example") SupervisorImageExample example);

    int updateByPrimaryKeySelective(SupervisorImage record);

    int updateByPrimaryKey(SupervisorImage record);
}

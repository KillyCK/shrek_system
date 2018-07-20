package com.shrek.supervisor.service;

import com.shrek.supervisor.entity.Department;
import com.shrek.supervisor.entity.DepartmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * service - 部门
 * @author shrek
 * create date ：2018年6月2日 上午9:59:06
 */
public interface DepartmentService {
	
    long countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);

    Department selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

}

package com.shrek.consumer.hystrixService;

import com.shrek.consumer.entity.Department;
import com.shrek.consumer.entity.DepartmentExample;
import com.shrek.consumer.service.DepartmentService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Hystric- 部门
 * @author shrek
 * create date ：2018年6月4日 下午4:38:58
 */
@Component
public class DepartmentServiceHystric implements DepartmentService {

	@Override
	public long countByExample(DepartmentExample example) {
		return 0;
	}

	@Override
	public int deleteByExample(DepartmentExample example) {
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return 0;
	}

	@Override
	public int insert(Department record) {
		return 0;
	}

	@Override
	public int insertSelective(Department record) {
		return 0;
	}

	@Override
	public List<Department> selectByExample(DepartmentExample example) {
		return null;
	}

	@Override
	public Department selectByPrimaryKey(Integer id) {
		return null;
	}

	@Override
	public int updateByExampleSelective(Department record, DepartmentExample example) {
		return 0;
	}

	@Override
	public int updateByExample(Department record, DepartmentExample example) {
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Department record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Department record) {
		return 0;
	}

}

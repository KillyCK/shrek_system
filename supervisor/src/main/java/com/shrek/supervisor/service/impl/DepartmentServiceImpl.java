package com.shrek.supervisor.service.impl;

import com.shrek.supervisor.dao.DepartmentDao;
import com.shrek.supervisor.entity.Department;
import com.shrek.supervisor.entity.DepartmentExample;
import com.shrek.supervisor.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * serviceimpl - 部门
 * @author shrek
 * create date ：2018年6月2日 上午10:23:31
 */
@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public long countByExample(DepartmentExample example) {
		return departmentDao.countByExample(example);
	}

	@Override
	public int deleteByExample(DepartmentExample example) {
		return departmentDao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return departmentDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Department record) {
		return departmentDao.insert(record);
	}

	@Override
	public int insertSelective(Department record) {
		return departmentDao.insertSelective(record);
	}

	@Override
	public List<Department> selectByExample(DepartmentExample example) {
		return departmentDao.selectByExample(example);
	}

	@Override
	public Department selectByPrimaryKey(Integer id) {
		return departmentDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Department record, DepartmentExample example) {
		return departmentDao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Department record, DepartmentExample example) {
		return departmentDao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Department record) {
		return departmentDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Department record) {
		return departmentDao.updateByPrimaryKey(record);
	}

}

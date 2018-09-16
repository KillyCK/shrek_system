package com.shrek.dbservice.service.impl;

import com.shrek.dbservice.dao.RolePermissionDao;
import com.shrek.dbservice.entity.RolePermission;
import com.shrek.dbservice.entity.RolePermissionExample;
import com.shrek.dbservice.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * serviceimpl-角色权限
 * @author shrek
 * create date ：2018年6月4日 上午12:08:21
 */
@Service
public class RolePermissionServiceImpl implements RolePermissionService{
	
	@Autowired
	private RolePermissionDao rolePermissionDao;

	@Override
	public long countByExample(RolePermissionExample example) {
		return rolePermissionDao.countByExample(example);
	}

	@Override
	public int deleteByExample(RolePermissionExample example) {
		return rolePermissionDao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return rolePermissionDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(RolePermission record) {
		return rolePermissionDao.insert(record);
	}

	@Override
	public int insertSelective(RolePermission record) {
		return rolePermissionDao.insertSelective(record);
	}

	@Override
	public List<RolePermission> selectByExample(RolePermissionExample example) {
		return rolePermissionDao.selectByExample(example);
	}

	@Override
	public RolePermission selectByPrimaryKey(Integer id) {
		return rolePermissionDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(RolePermission record, RolePermissionExample example) {
		return rolePermissionDao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(RolePermission record, RolePermissionExample example) {
		return rolePermissionDao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(RolePermission record) {
		return rolePermissionDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(RolePermission record) {
		return rolePermissionDao.updateByPrimaryKey(record);
	}

}

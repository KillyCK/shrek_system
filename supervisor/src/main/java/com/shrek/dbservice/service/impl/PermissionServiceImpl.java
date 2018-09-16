package com.shrek.dbservice.service.impl;

import com.shrek.dbservice.dao.PermissionDao;
import com.shrek.dbservice.entity.Permission;
import com.shrek.dbservice.entity.PermissionExample;
import com.shrek.dbservice.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * serviceimpl-权限
 * @author shrek
 * create date ：2018年6月4日 上午12:07:56
 */
@Service
public class PermissionServiceImpl implements PermissionService {
	
	@Autowired
	private PermissionDao permissionDao;

	@Override
	public long countByExample(PermissionExample example) {
		return permissionDao.countByExample(example);
	}

	@Override
	public int deleteByExample(PermissionExample example) {
		return permissionDao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return permissionDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Permission record) {
		return permissionDao.insert(record);
	}

	@Override
	public int insertSelective(Permission record) {
		return permissionDao.insertSelective(record);
	}

	@Override
	public List<Permission> selectByExample(PermissionExample example) {
		return permissionDao.selectByExample(example);
	}

	@Override
	public Permission selectByPrimaryKey(Integer id) {
		return permissionDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Permission record, PermissionExample example) {
		return permissionDao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Permission record, PermissionExample example) {
		return permissionDao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Permission record) {
		return permissionDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Permission record) {
		return permissionDao.updateByPrimaryKey(record);
	}

}

package com.shrek.dbservice.service.impl;

import com.shrek.dbservice.dao.RoleDao;
import com.shrek.dbservice.entity.Role;
import com.shrek.dbservice.entity.RoleExample;
import com.shrek.dbservice.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * serviceimpl - 角色
 * @author shrek
 * create date ：2018年6月2日 上午10:25:11
 */
@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleDao roleDao;

	@Override
	public long countByExample(RoleExample example) {
		return roleDao.countByExample(example);
	}

	@Override
	public int deleteByExample(RoleExample example) {
		return roleDao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return roleDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Role record) {
		return roleDao.insert(record);
	}

	@Override
	public int insertSelective(Role record) {
		return roleDao.insertSelective(record);
	}

	@Override
	public List<Role> selectByExample(RoleExample example) {
		return roleDao.selectByExample(example);
	}

	@Override
	public Role selectByPrimaryKey(Integer id) {
		return roleDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Role record, RoleExample example) {
		return roleDao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Role record, RoleExample example) {
		return roleDao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Role record) {
		return roleDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Role record) {
		return roleDao.updateByPrimaryKey(record);
	}

}

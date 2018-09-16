package com.shrek.dbservice.service.impl;

import com.shrek.dbservice.dao.SupervisorRoleDao;
import com.shrek.dbservice.entity.SupervisorRole;
import com.shrek.dbservice.entity.SupervisorRoleExample;
import com.shrek.dbservice.service.SupervisorRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * serviceimpl - 管理员认证
 * @author shrek
 * create date ：2018年6月2日 上午10:25:33
 */
@Service
public class SupervisorRoleServcieImpl implements SupervisorRoleService {
	
	@Autowired
	private SupervisorRoleDao supervisorRoleDao;

	@Override
	public long countByExample(SupervisorRoleExample example) {
		return supervisorRoleDao.countByExample(example);
	}

	@Override
	public int deleteByExample(SupervisorRoleExample example) {
		return supervisorRoleDao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return supervisorRoleDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SupervisorRole record) {
		return supervisorRoleDao.insert(record);
	}

	@Override
	public int insertSelective(SupervisorRole record) {
		return supervisorRoleDao.insertSelective(record);
	}

	@Override
	public List<SupervisorRole> selectByExample(SupervisorRoleExample example) {
		return supervisorRoleDao.selectByExample(example);
	}

	@Override
	public SupervisorRole selectByPrimaryKey(Integer RoleId) {
		return supervisorRoleDao.selectByPrimaryKey(RoleId);
	}

	@Override
	public int updateByExampleSelective(SupervisorRole record, SupervisorRoleExample example) {
		return supervisorRoleDao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(SupervisorRole record, SupervisorRoleExample example) {
		return supervisorRoleDao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(SupervisorRole record) {
		return supervisorRoleDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SupervisorRole record) {
		return supervisorRoleDao.updateByPrimaryKey(record);
	}

}

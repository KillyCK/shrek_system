package com.shrek.supervisor.service.impl;

import com.shrek.supervisor.dao.SupervisorInfoDao;
import com.shrek.supervisor.entity.SupervisorInfo;
import com.shrek.supervisor.entity.SupervisorInfoExample;
import com.shrek.supervisor.service.SupervisorInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * serviceimpl-管理员信息
 * @author shrek
 * create date ：2018年6月2日 上午10:27:07
 */
@Service
public class SupervisorInfoServiceImpl implements SupervisorInfoService {
	
	@Autowired
	private SupervisorInfoDao supervisorInfoDao;

	@Override
	public long countByExample(SupervisorInfoExample example) {
		return supervisorInfoDao.countByExample(example);
	}

	@Override
	public int deleteByExample(SupervisorInfoExample example) {
		return supervisorInfoDao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return supervisorInfoDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SupervisorInfo record) {
		return supervisorInfoDao.insert(record);
	}

	@Override
	public int insertSelective(SupervisorInfo record) {
		return supervisorInfoDao.insertSelective(record);
	}

	@Override
	public List<SupervisorInfo> selectByExample(SupervisorInfoExample example) {
		return supervisorInfoDao.selectByExample(example);
	}

	@Override
	public SupervisorInfo selectByPrimaryKey(Integer id) {
		return supervisorInfoDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(SupervisorInfo record, SupervisorInfoExample example) {
		return supervisorInfoDao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(SupervisorInfo record, SupervisorInfoExample example) {
		return supervisorInfoDao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(SupervisorInfo record) {
		return supervisorInfoDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SupervisorInfo record) {
		return supervisorInfoDao.updateByPrimaryKey(record);
	}

}

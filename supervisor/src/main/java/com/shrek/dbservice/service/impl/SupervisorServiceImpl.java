package com.shrek.dbservice.service.impl;

import com.shrek.dbservice.dao.SupervisorDao;
import com.shrek.dbservice.entity.Supervisor;
import com.shrek.dbservice.entity.SupervisorExample;
import com.shrek.dbservice.service.SupervisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * supervisor的service
 * @author shrek
 * create date ：2018年5月31日 上午6:30:07
 */
@Service
public class SupervisorServiceImpl implements SupervisorService{
	
	@Autowired
	private SupervisorDao supervisorDao;

	@Override
	public long countByExample(SupervisorExample example) {
		return supervisorDao.countByExample(example);
	}

	@Override
	public int deleteByExample(SupervisorExample example) {
		return supervisorDao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return supervisorDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Supervisor record) {
		return supervisorDao.insert(record);
	}

	@Override
	public int insertSelective(Supervisor record) {
		return supervisorDao.insertSelective(record);
	}

	@Override
	public List<Supervisor> selectByExample(SupervisorExample example) {
		return supervisorDao.selectByExample(example);
	}

	@Override
	public Supervisor selectByPrimaryKey(Integer id) {
		return supervisorDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Supervisor record, SupervisorExample example) {
		return supervisorDao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Supervisor record, SupervisorExample example) {
		return supervisorDao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Supervisor record) {
		return supervisorDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Supervisor record) {
		return supervisorDao.updateByPrimaryKey(record);
	}

}

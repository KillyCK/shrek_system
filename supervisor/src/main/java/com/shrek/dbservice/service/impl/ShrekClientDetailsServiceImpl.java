package com.shrek.dbservice.service.impl;

import com.shrek.dbservice.dao.ShrekClientDetailsDao;
import com.shrek.dbservice.entity.ShrekClientDetails;
import com.shrek.dbservice.entity.ShrekClientDetailsExample;
import com.shrek.dbservice.service.ShrekClientDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * serviceimpl - 客户端
 * @author shrek
 * create date ：2018年6月2日 上午10:23:54
 */
@Service
public class ShrekClientDetailsServiceImpl implements ShrekClientDetailsService {
	
	@Autowired
	private ShrekClientDetailsDao shrekClientDetailsDao;

	@Override
	public long countByExample(ShrekClientDetailsExample example) {
		return shrekClientDetailsDao.countByExample(example);
	}

	@Override
	public int deleteByExample(ShrekClientDetailsExample example) {
		return shrekClientDetailsDao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String clientId) {
		return shrekClientDetailsDao.deleteByPrimaryKey(clientId);
	}

	@Override
	public int insert(ShrekClientDetails record) {
		return shrekClientDetailsDao.insert(record);
	}

	@Override
	public int insertSelective(ShrekClientDetails record) {
		return shrekClientDetailsDao.insertSelective(record);
	}

	@Override
	public List<ShrekClientDetails> selectByExample(ShrekClientDetailsExample example) {
		return shrekClientDetailsDao.selectByExample(example);
	}

	@Override
	public ShrekClientDetails selectByPrimaryKey(String clientId) {
		return shrekClientDetailsDao.selectByPrimaryKey(clientId);
	}

	@Override
	public int updateByExampleSelective(ShrekClientDetails record, ShrekClientDetailsExample example) {
		return shrekClientDetailsDao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ShrekClientDetails record, ShrekClientDetailsExample example) {
		return shrekClientDetailsDao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(ShrekClientDetails record) {
		return shrekClientDetailsDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ShrekClientDetails record) {
		return shrekClientDetailsDao.updateByPrimaryKey(record);
	}
}

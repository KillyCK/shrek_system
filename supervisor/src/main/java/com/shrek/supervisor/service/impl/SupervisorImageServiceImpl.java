package com.shrek.supervisor.service.impl;

import com.shrek.supervisor.dao.SupervisorImageDao;
import com.shrek.supervisor.entity.SupervisorImage;
import com.shrek.supervisor.entity.SupervisorImageExample;
import com.shrek.supervisor.service.SupervisorImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * serviceimpl－管理员图片
 * @author shrek
 * create date ：2018年6月2日 上午10:26:41
 */
@Service
public class SupervisorImageServiceImpl implements SupervisorImageService{

	@Autowired
	private SupervisorImageDao supervisorImage;
	
	@Override
	public long countByExample(SupervisorImageExample example) {
		return supervisorImage.countByExample(example);
	}

	@Override
	public int deleteByExample(SupervisorImageExample example) {
		return supervisorImage.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return supervisorImage.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SupervisorImage record) {
		return supervisorImage.insert(record);
	}

	@Override
	public int insertSelective(SupervisorImage record) {
		return supervisorImage.insertSelective(record);
	}

	@Override
	public List<SupervisorImage> selectByExample(SupervisorImageExample example) {
		return supervisorImage.selectByExample(example);
	}

	@Override
	public SupervisorImage selectByPrimaryKey(Integer id) {
		return supervisorImage.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(SupervisorImage record, SupervisorImageExample example) {
		return supervisorImage.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(SupervisorImage record, SupervisorImageExample example) {
		return supervisorImage.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(SupervisorImage record) {
		return supervisorImage.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SupervisorImage record) {
		return supervisorImage.updateByPrimaryKey(record);
	}

}

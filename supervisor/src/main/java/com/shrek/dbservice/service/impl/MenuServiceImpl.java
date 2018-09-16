package com.shrek.dbservice.service.impl;

import com.shrek.dbservice.dao.MenuDao;
import com.shrek.dbservice.entity.Menu;
import com.shrek.dbservice.entity.MenuExample;
import com.shrek.dbservice.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * serviceimpl - 菜单
 * @author shrek
 * create date ：2018年6月2日 上午10:23:54
 */
@Service
public class MenuServiceImpl implements MenuService{
	
	@Autowired
	private MenuDao menuDao;

	@Override
	public long countByExample(MenuExample example) {
		return menuDao.countByExample(example);
	}

	@Override
	public int deleteByExample(MenuExample example) {
		return menuDao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return menuDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Menu record) {
		return menuDao.insert(record);
	}

	@Override
	public int insertSelective(Menu record) {
		return menuDao.insertSelective(record);
	}

	@Override
	public List<Menu> selectByExample(MenuExample example) {
		return menuDao.selectByExample(example);
	}

	@Override
	public Menu selectByPrimaryKey(Integer id) {
		return menuDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Menu record, MenuExample example) {
		return menuDao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Menu record, MenuExample example) {
		return menuDao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Menu record) {
		return menuDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Menu record) {
		return menuDao.updateByPrimaryKey(record);
	}

}

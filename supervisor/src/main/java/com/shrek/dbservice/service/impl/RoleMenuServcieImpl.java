package com.shrek.dbservice.service.impl;

import com.shrek.dbservice.dao.RoleMenuDao;
import com.shrek.dbservice.entity.RoleMenu;
import com.shrek.dbservice.entity.RoleMenuExample;
import com.shrek.dbservice.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * serviceimpl-角色菜单
 * @author shrek
 * create date ：2018年6月2日 上午10:24:49
 */
@Service
public class RoleMenuServcieImpl implements RoleMenuService{

   @Autowired
   private RoleMenuDao roleMenuDao;

   @Override
   public long countByExample(RoleMenuExample example) {
       return roleMenuDao.countByExample(example);
   }

   @Override
   public int deleteByExample(RoleMenuExample example) {
       return roleMenuDao.deleteByExample(example);
   }

   @Override
   public int deleteByPrimaryKey(Integer id) {
       return roleMenuDao.deleteByPrimaryKey(id);
   }

   @Override
   public int insert(RoleMenu record) {
       return roleMenuDao.insert(record);
   }

   @Override
   public int insertSelective(RoleMenu record) {
       return roleMenuDao.insertSelective(record);
   }

   @Override
   public List<RoleMenu> selectByExample(RoleMenuExample example) {
       return roleMenuDao.selectByExample(example);
   }

   @Override
   public RoleMenu selectByPrimaryKey(Integer id) {
       return roleMenuDao.selectByPrimaryKey(id);
   }

   @Override
   public int updateByExampleSelective(RoleMenu record, RoleMenuExample example) {
       return roleMenuDao.updateByExampleSelective(record, example);
   }

   @Override
   public int updateByExample(RoleMenu record, RoleMenuExample example) {
       return roleMenuDao.updateByExample(record, example);
   }

   @Override
   public int updateByPrimaryKeySelective(RoleMenu record) {
       return roleMenuDao.updateByPrimaryKeySelective(record);
   }

   @Override
   public int updateByPrimaryKey(RoleMenu record) {
       return roleMenuDao.updateByPrimaryKey(record);
   }

}

package com.shrek.dbservice.service;

import com.shrek.dbservice.entity.Menu;
import com.shrek.dbservice.entity.MenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * service － 菜单
 * @author shrek
 * create date ：2018年6月2日 上午9:59:29
 */
public interface MenuService {

    long countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}

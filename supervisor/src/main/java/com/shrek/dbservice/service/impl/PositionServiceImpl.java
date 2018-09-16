package com.shrek.dbservice.service.impl;

import com.shrek.dbservice.dao.PositionDao;
import com.shrek.dbservice.entity.Position;
import com.shrek.dbservice.entity.PositionExample;
import com.shrek.dbservice.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: shrek
 * @Date: 2018/7/17 8:38
 * @Description:
 */
@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionDao positionDao;

    @Override
    public long countByExample(PositionExample example) {
        return positionDao.countByExample(example);
    }

    @Override
    public int deleteByExample(PositionExample example) {
        return positionDao.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer positionId) {
        return positionDao.deleteByPrimaryKey(positionId);
    }

    @Override
    public int insert(Position record) {
        return positionDao.insert(record);
    }

    @Override
    public int insertSelective(Position record) {
        return positionDao.insertSelective(record);
    }

    @Override
    public List<Position> selectByExample(PositionExample example) {
        return positionDao.selectByExample(example);
    }

    @Override
    public Position selectByPrimaryKey(Integer positionId) {
        return positionDao.selectByPrimaryKey(positionId);
    }

    @Override
    public int updateByExampleSelective(Position record, PositionExample example) {
        return positionDao.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Position record, PositionExample example) {
        return positionDao.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Position record) {
        return positionDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Position record) {
        return positionDao.updateByPrimaryKey(record);
    }
}

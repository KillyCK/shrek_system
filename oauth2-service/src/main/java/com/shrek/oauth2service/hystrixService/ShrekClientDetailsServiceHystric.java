package com.shrek.oauth2service.hystrixService;


import com.shrek.oauth2service.entity.ShrekClientDetails;
import com.shrek.oauth2service.entity.ShrekClientDetailsExample;
import com.shrek.oauth2service.service.ShrekClientDetailsService;

import java.util.List;

public class ShrekClientDetailsServiceHystric implements ShrekClientDetailsService {


	@Override
	public long countByExample(ShrekClientDetailsExample example) {
		return 0;
	}

	@Override
	public int deleteByExample(ShrekClientDetailsExample example) {
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(String clientId) {
		return 0;
	}

	@Override
	public int insert(ShrekClientDetails record) {
		return 0;
	}

	@Override
	public int insertSelective(ShrekClientDetails record) {
		return 0;
	}

	@Override
	public List<ShrekClientDetails> selectByExample(ShrekClientDetailsExample example) {
		return null;
	}

	@Override
	public ShrekClientDetails selectByPrimaryKey(String clientId) {
		return null;
	}

	@Override
	public int updateByExampleSelective(ShrekClientDetails record, ShrekClientDetailsExample example) {
		return 0;
	}

	@Override
	public int updateByExample(ShrekClientDetails record, ShrekClientDetailsExample example) {
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(ShrekClientDetails record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(ShrekClientDetails record) {
		return 0;
	}
}

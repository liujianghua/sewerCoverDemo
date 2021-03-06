package com.kwantler.service;

import java.util.List;
import java.util.Map;

import com.kwantler.model.WaterDetect;

public interface IWaterDetectService {
	int deleteByPrimaryKey(Integer id);

	int insert(WaterDetect record);

	int insertSelective(WaterDetect record);

	WaterDetect selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(WaterDetect record);

	int updateByPrimaryKey(WaterDetect record);
	
	List<WaterDetect> selectAll(Map<String, Object> params);
	
	int updateStatusByPk(WaterDetect record);
}
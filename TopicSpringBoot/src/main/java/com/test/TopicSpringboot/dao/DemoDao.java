package com.test.TopicSpringboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.test.TopicSpringboot.scheme.DemoScheme;

public interface DemoDao {
	
	@Select("select * from demo")
	public List<DemoScheme> getAll();
	
	@Mapper
	public DemoScheme getDataById(int id);
	
	@Mapper
	public List<DemoScheme> queryAll();
	
	@Mapper
	public int insert(DemoScheme scheme);
	
	@Mapper
	public int updateById(DemoScheme scheme);
	
	@Mapper
	public int deleteById(DemoScheme scheme);
}

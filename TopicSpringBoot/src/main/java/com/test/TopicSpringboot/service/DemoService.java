package com.test.TopicSpringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.TopicSpringboot.dao.DemoDao;
import com.test.TopicSpringboot.scheme.DemoScheme;

@Service
public class DemoService {
	
	@Autowired
	private DemoDao dao;
	
	public DemoScheme selectOne(int id){
		return dao.getDataById(id);
	}
	
	public List<DemoScheme> queryAll(){
		return dao.queryAll();
	}
	
	public void insert(DemoScheme scheme){
		dao.insert(scheme);
	}
	
	public void update(DemoScheme scheme){
		dao.updateById(scheme);
	}
	
	public void delete(DemoScheme scheme){
		dao.deleteById(scheme);
	}
	
}

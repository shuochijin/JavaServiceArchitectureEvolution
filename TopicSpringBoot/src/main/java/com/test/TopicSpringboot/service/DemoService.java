package com.test.TopicSpringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.test.TopicSpringboot.dao.DemoDao;
import com.test.TopicSpringboot.scheme.DemoScheme;

@Service
public class DemoService {
	
	@Autowired
	private DemoDao dao;

	@Cacheable(cacheNames="demo")
	public DemoScheme getDataById(int id){
		return dao.getDataById(id);
	}

	public List<DemoScheme> queryAll(){
		return dao.queryAll();
	}

	public void insert(DemoScheme scheme){
		dao.insert(scheme);
	}

	@CachePut(cacheNames="demo",key="#scheme.id")
	public DemoScheme update(DemoScheme scheme){
		dao.updateById(scheme);
		return scheme;
	}

	@CacheEvict(cacheNames="demo",key="#scheme.id")
	public void delete(DemoScheme scheme){
		dao.deleteById(scheme);
	}
	
}

package cn.com.repository.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.repository.dao.ObjectDao;
import cn.com.repository.entity.ObjectEntity;

@Service
public class ObjectService {
	
	@Autowired
	private ObjectDao dao;

	public ObjectEntity getDataById(int id) {
		return dao.getDataById(id);
	}

	public List<ObjectEntity> queryAll(){
		return dao.queryAll();
	}

	public List<ObjectEntity> queryPage(Map map){
		return dao.queryPage(map);
	}

	public ObjectEntity insert(ObjectEntity entity) {
		dao.insert(entity);
		System.out.println("insert id:" + entity.getId());
		return entity;
	}
	
	public int updateById(ObjectEntity entity) {
		return dao.updateById(entity);
	}
	
	public int deleteById(ObjectEntity entity) {
		return dao.deleteById(entity);
	}
	
	public int deleteByIds(List list) {
		return dao.deleteByIds(list);
	}
	
}

package cn.com.repository.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import cn.com.repository.entity.ObjectEntity;

public interface ObjectDao {

	@Mapper
	public ObjectEntity getDataById(long id);

	@Mapper
	public List<ObjectEntity> queryAll();

	@Mapper
	public List<ObjectEntity> queryPage(Map map);

	@Mapper
	public int insert(ObjectEntity entity);
	
	@Mapper
	public int updateById(ObjectEntity entity);
	
	@Mapper
	public int deleteById(ObjectEntity entity);
	
	@Mapper
	public int deleteByIds(List list);
}

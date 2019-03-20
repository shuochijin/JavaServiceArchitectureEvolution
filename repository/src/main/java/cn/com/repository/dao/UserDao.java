package cn.com.repository.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.com.repository.entity.UserEntity;

public interface UserDao {
	
	@Mapper
	public UserEntity getDataById(long id);
	
	@Mapper
	public List<UserEntity> queryAll();
	
	@Mapper
	public int insert(UserEntity entity);
	
	@Mapper
	public int updateById(UserEntity entity);
	
	@Mapper
	public int deleteById(long id);
}

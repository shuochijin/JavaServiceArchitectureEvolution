package cn.com.repository.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import cn.com.repository.dao.UserDao;
import cn.com.repository.entity.UserEntity;

public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public UserEntity getDataById(long id) {
		return userDao.getDataById(id);
	}
	
	public List<UserEntity> queryAll(){
		return userDao.queryAll();
	}
	
	public int insert(UserEntity entity) {
		return userDao.insert(entity);
	}
	
	public int updateById(UserEntity entity){
		return userDao.updateById(entity);
	}
	
	public int deleteById(long id) {
		return userDao.deleteById(id);
	}


}

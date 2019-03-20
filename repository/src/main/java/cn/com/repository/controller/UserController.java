package cn.com.repository.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.com.repository.entity.UserEntity;
import cn.com.repository.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public UserEntity getDataById(@PathVariable long id) {
		return userService.getDataById(id);
	}
	
	@RequestMapping(value="/queryAll", method=RequestMethod.GET)
	public List<UserEntity> queryAll(){
		return userService.queryAll();
	}

	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public int insert(@RequestBody UserEntity entity) {
		return userService.insert(entity);
	}

	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public int updateById(@PathVariable long id) {
		UserEntity entity = new UserEntity();
		entity.setId(id);
		return userService.updateById(entity);
	}

	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public int deleteById(@PathVariable long id) {
		return userService.deleteById(id);
	
	}
	
}

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
	
	@RequestMapping(value="/{uid}", method=RequestMethod.GET)
	public UserEntity getDataById(@PathVariable long uid) {
		return userService.getDataById(uid);
	}
	
	@RequestMapping(value="/queryAll", method=RequestMethod.GET)
	public List<UserEntity> queryAll(){
		return userService.queryAll();
	}

	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public int insert(@RequestBody UserEntity entity) {
		return userService.insert(entity);
	}

	@RequestMapping(value="/{uid}", method=RequestMethod.PUT)
	public int updateById(@PathVariable long uid) {
		UserEntity entity = new UserEntity();
		entity.setUid(uid);
		return userService.updateById(entity);
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public int updateById(@RequestBody UserEntity entity) {
		System.out.println(entity.getUid());
		return userService.updateById(entity);
	}

	@RequestMapping(value="/{uid}", method=RequestMethod.DELETE)
	public int deleteById(@PathVariable long uid) {
		return userService.deleteById(uid);
	
	}
	
}

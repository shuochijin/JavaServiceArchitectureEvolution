package cn.com.repository.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.com.repository.entity.ObjectEntity;
import cn.com.repository.service.ObjectService;
import cn.com.repository.util.AjaxResponseData;

@RestController
@RequestMapping("/Object")
public class ObjectController {
	
	@Autowired
	private ObjectService service;
	
	@RequestMapping(value = "/getDataById/{id}", method = RequestMethod.GET)
	public AjaxResponseData getDataById(@PathVariable int id) {
		System.out.println(id);
		AjaxResponseData result = new AjaxResponseData();
		
		result.setIsSuccess("success");
		List<ObjectEntity> list = new ArrayList<ObjectEntity>();
		list.add(service.getDataById(id));
		result.setData(list);
		
		return result;
	}
	
	@RequestMapping(value = "/queryAll", method = RequestMethod.GET)
	public AjaxResponseData queryAll() {
		AjaxResponseData result = new AjaxResponseData();
		
		result.setIsSuccess("success");
		List<ObjectEntity> list = service.queryAll();
		result.setData(list);
		
		return result;
	}
	
	@RequestMapping(value = "/queryPage/{pageIndex}/{pageSize}", method = RequestMethod.GET)
	public AjaxResponseData queryPage(@PathVariable int pageIndex, @PathVariable int pageSize) {
		AjaxResponseData result = new AjaxResponseData();

		System.out.println((pageIndex - 1) * pageSize);
		System.out.println(pageSize);
		result.setIsSuccess("success");
		Map map = new HashMap();
		map.put("pageIndex", (pageIndex - 1) * pageSize);
		map.put("pageSize", pageSize);
		List<ObjectEntity> list = service.queryPage(map);
		result.setData(list);
		
		return result;
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public AjaxResponseData insert() {
		AjaxResponseData result = new AjaxResponseData();
		
		result.setIsSuccess("success");
		ObjectEntity entity = new ObjectEntity();
		entity.setName("a" + System.currentTimeMillis() % 1000);
		entity.setType("物品");
		entity.setUid(1);
		entity.setRemark("物品" + System.currentTimeMillis() % 10);
		entity.setBarcode("");
		service.insert(entity);
		result.setData(entity);
		
		return result;
	}
	
	@RequestMapping(value = "/updateById/{id}", method = RequestMethod.GET)
	public AjaxResponseData updateById(@PathVariable int id) {
		AjaxResponseData result = new AjaxResponseData();

		System.out.println(id);
		result.setIsSuccess("success");
		ObjectEntity entity = new ObjectEntity();
		entity.setId(id);
		entity.setName("a" + System.currentTimeMillis() % 1000);
		entity.setType("物品");
		entity.setUid(1);
		entity.setRemark("物品" + System.currentTimeMillis() % 10);
		entity.setBarcode("");
		service.updateById(entity);
		result.setData(entity);
		
		return result;
	}
	
	@RequestMapping(value = "/deleteById/{id}", method = RequestMethod.GET)
	public AjaxResponseData deleteById(@PathVariable int id) {
		AjaxResponseData result = new AjaxResponseData();

		System.out.println(id);
		result.setIsSuccess("success");
		ObjectEntity entity = new ObjectEntity();
		entity.setId(id);
		service.deleteById(entity);
		result.setData("");
		
		return result;
	}
	
	@RequestMapping(value = "/deleteByIds", method = RequestMethod.GET)
	public AjaxResponseData deleteByIds() {
		AjaxResponseData result = new AjaxResponseData();

		result.setIsSuccess("success");
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		service.deleteByIds(list);
		result.setData("");
		
		return result;
	}
	
}

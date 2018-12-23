package com.test.TopicSpringboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.TopicSpringboot.scheme.DemoScheme;
import com.test.TopicSpringboot.service.DemoService;
import com.test.log.LogUtil;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	private DemoService service;
	
	@GetMapping
	public Map<String, Object> queryAll(){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		List<String> head = new ArrayList<String>();
		head.add("id");
		head.add("name");
		head.add("value");
		
		resultMap.put("head", head);
		
		List<List<String>> value = new ArrayList<List<String>>();
		List<String> row;
		
		List<DemoScheme> queryResult = new ArrayList<DemoScheme>();
		
		queryResult = service.queryAll();
		
		for(int i = 0; i < queryResult.size(); ++ i){
			DemoScheme scheme = (DemoScheme)queryResult.get(i);
			row = new ArrayList<String>();
			row.add(scheme.getId() + "");
			row.add(scheme.getName());
			row.add(scheme.getValue());
			
			value.add(row);
		}
		
		resultMap.put("value", value);
		
		try {
			LogUtil.fatal(new ObjectMapper().writeValueAsString(resultMap));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return resultMap;
	}
	
	@GetMapping("/{id}")
	public DemoScheme selectOne(@PathVariable int id){
		DemoScheme scheme = new DemoScheme();
		try{
			scheme = service.selectOne(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try {
			LogUtil.fatal(new ObjectMapper().writeValueAsString(scheme));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return scheme;
	}
	
	@PostMapping
	public String insert(@RequestParam String name, @RequestParam String value){
		String message = "";
		DemoScheme scheme = new DemoScheme();
		
		try{
			scheme.setName(name);
			scheme.setValue(value);
			service.insert(scheme);
			message = "success";
		}catch(Exception e){
			message = "failed";
		}
		
		try {
			LogUtil.fatal(new ObjectMapper().writeValueAsString(scheme));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return message;
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id){
		String message = "";
		DemoScheme scheme = new DemoScheme();
		try{
			scheme.setId(id);
			service.delete(scheme);
			message = "success";
		}catch(Exception e){
			message = "failed";
		}
		
		try {
			LogUtil.fatal(new ObjectMapper().writeValueAsString(scheme));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return message;
	}
	
	@PutMapping("/{id}")
	public String update(@PathVariable int id, @RequestParam String name, @RequestParam String value){
		String message = "";
		System.out.println(id);
		DemoScheme scheme = new DemoScheme();
		try{
			scheme.setId(id);
			scheme.setName(name);
			scheme.setValue(value);
			service.update(scheme);
			message = "success";
		}catch(Exception e){
			message = "failed";
		}
		
		try {
			LogUtil.fatal(new ObjectMapper().writeValueAsString(scheme));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return message;
	}
	
}

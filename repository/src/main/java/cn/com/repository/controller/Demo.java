package cn.com.repository.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@ResponseBody
@RequestMapping("/demo")
public class Demo {
	
	@RequestMapping(method= RequestMethod.GET)
	public String hello(String name) throws JsonProcessingException {
		ArrayList list = new ArrayList();
		list.add("hello");
		return new ObjectMapper().writeValueAsString(list);
	}

}

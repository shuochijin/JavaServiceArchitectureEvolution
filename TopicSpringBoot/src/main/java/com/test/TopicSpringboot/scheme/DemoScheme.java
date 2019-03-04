package com.test.TopicSpringboot.scheme;

import java.io.Serializable;

public class DemoScheme implements Serializable {
	
	private static final long serialVersionUID = -5941471445085050699L;

	private int id;
	
	private String name;
	
	private String value;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append("[");
		s.append(this.getId());
		s.append(",");
		s.append(this.getName());
		s.append(",");
		s.append(this.getValue());
		s.append("]");
		return s.toString();
	}
	
}

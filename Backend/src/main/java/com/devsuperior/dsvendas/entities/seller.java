package com.devsuperior.dsvendas.entities;

import java.util.ArrayList;
import java.util.List;

public class seller {
	
	private Long id;
	private String name;
	
	private List<sale> sales = new 	ArrayList<>();
	
	public seller() {
		
	}
	
	public seller(Long id, String name) {
		this.id = id;
		this.name = name;
			
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<sale> getSales() {
		return sales;
	}
	
	

}

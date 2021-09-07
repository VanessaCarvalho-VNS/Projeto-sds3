package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class sale {
	
	private long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	private seller seller;
	
	public sale() {	
	}

	public sale(long id, Integer visited, Integer deals, Double amount, LocalDate date, seller seller) {
			
	    this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public seller getSeller() {
		return seller;
	}

	public void setSeller(seller seller) {
		this.seller = seller;
	}
	
	
}

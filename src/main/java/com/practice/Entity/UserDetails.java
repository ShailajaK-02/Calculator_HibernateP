package com.practice.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "calculator_usage")
public class UserDetails {
	
	@Id
	@Column(name ="User Name")
	private String username;
	
	@Column(name ="Total Operation Performed")
	private int totalOprPerformed;
	
	@Column(name ="Cost")
	private int cost;

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getTotalOprPerformed() {
		return totalOprPerformed;
	}

	public void setTotalOprPerformed(int totalOprPerformed) {
		this.totalOprPerformed = totalOprPerformed;
	}
	
	
}

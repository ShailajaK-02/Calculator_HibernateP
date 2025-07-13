package com.practice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "calculator_usage")
public class UserDetails {
	
	@Id
	private String username;
	
	private int totalOprPerformed;

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

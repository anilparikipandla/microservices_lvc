package com.example.demo;

public class BloodType {

	public BloodType() {
		// TODO Auto-generated constructor stub
	}
	
	private String bloodGroup;
	private boolean isAvailable;
	
	public BloodType(String bloodGroup, boolean isAvailable) {
		super();
		this.bloodGroup = bloodGroup;
		this.isAvailable = isAvailable;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "BloodType [bloodGroup=" + bloodGroup + ", isAvailable=" + isAvailable + "]";
	}
	
	
	
	

}

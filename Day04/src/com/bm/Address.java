package com.bm;

public class Address {
	String lane1;
	String lane2;

	public Address() {

	}

	public Address(String lane1, String lane2) {
//		System.out.println("Inside Address Cnstructor");
		this.lane1 = lane1;
		this.lane2 = lane2;
	}

	public String getLane1() {
		return lane1;
	}

	public void setLane1(String lane1) {
		this.lane1 = lane1;
	}

	public String getLane2() {
		return lane2;
	}

	public void setLane2(String lane2) {
		this.lane2 = lane2;
	}

}

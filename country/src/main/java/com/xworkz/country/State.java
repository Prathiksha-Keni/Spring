package com.xworkz.country;

public class State {

	private String name;
	private int pincode;

	public State(String name, int pincode) {
		super();
		this.name = name;
		this.pincode = pincode;
	}

	public State() {
		System.out.println("State bean created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", pincode=" + pincode + "]";
	}

}

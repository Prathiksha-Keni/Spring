package com.xworkz.country;

public class Currency {

	private String name;
	private double value;

	public Currency(String name, double value) {
		super();
		this.name = name;
		this.value = value;
	}

	public Currency() {
		System.out.println("Currency bean created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Currency [name=" + name + ", value=" + value + "]";
	}

}

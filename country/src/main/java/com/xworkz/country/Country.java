package com.xworkz.country;

public class Country {

	private String name;
	private String code;
	private Currency currency;
	private State state;

	public Country(String name, String code, Currency currency, State state) {
		System.out.println("Country bean created");
		this.name = name;
		this.code = code;
		this.currency = currency;
		this.state = state;
		System.out.println(this.state);
		System.out.println(this.currency);
		System.out.println(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", code=" + code + ", currency=" + currency + ", state=" + state + "]";
	}

}

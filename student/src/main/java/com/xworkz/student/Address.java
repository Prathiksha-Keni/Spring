package com.xworkz.student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	private int houseNo;
	private String main;
	private String cross;
	private String phase;
	private String layout;
	private String area;
	private int pincode;

	public int getHouseNo() {
		return houseNo;
	}
	@Value("33")
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getMain() {
		return main;
	}
	@Value("9th main")
	public void setMain(String main) {
		this.main = main;
	}

	public String getCross() {
		return cross;
	}
	@Value("6rd cross")
	public void setCross(String cross) {
		this.cross = cross;
	}

	public String getPhase() {
		return phase;
	}
	@Value("3rd phase")
	public void setPhase(String phase) {
		this.phase = phase;
	}

	public String getLayout() {
		return layout;
	}
	@Value("rk layout")
	public void setLayout(String layout) {
		this.layout = layout;
	}

	public String getArea() {
		return area;
	}
	@Value("padmanabhanagara")
	public void setArea(String area) {
		this.area = area;
	}

	public int getPincode() {
		return pincode;
	}
	@Value("560070")
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", main=" + main + ", cross=" + cross + ", phase=" + phase + ", layout="
				+ layout + ", area=" + area + ", pincode=" + pincode + "]";
	}

}

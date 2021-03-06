package com.xworkz.park;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tree {
	private String name;
	private String type;
	private double width;
	private double heigth;
	private int noOfBranches;
	private int age;

	public Tree(@Value("Tree-1")String name, @Value("long")String type, @Value("20.5")double width, @Value("25.5")double heigth, @Value("5")int noOfBranches, @Value("75")int age) {
		System.out.println("Tree Bean created");
		this.name = name;
		this.type = type;
		this.width = width;
		this.heigth = heigth;
		this.noOfBranches = noOfBranches;
		this.age = age;
	}

//	public Tree() {
//		System.out.println("Tree Bean created");
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public int getNoOfBranches() {
		return noOfBranches;
	}

	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Tree [name=" + name + ", type=" + type + ", width=" + width + ", heigth=" + heigth + ", noOfBranches="
				+ noOfBranches + ", age=" + age + "]";
	}

}

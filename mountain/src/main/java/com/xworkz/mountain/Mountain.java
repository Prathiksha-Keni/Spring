package com.xworkz.mountain;

public class Mountain {

	private String name;
	private double height;
	private String location;
	private String landform;
	private String type;
	private double areaOccupied;
	private String formOfMountain;

	public Mountain() {
		System.out.println(this.getClass().getSimpleName() + " object created");

	}

	public Mountain(String name, double height, String location, String landform, String type, double areaOccupied,
			String formOfMountain) {
		System.out.println("Bean created using constructors of 7agrs");
		this.name = name;
		this.height = height;
		this.location = location;
		this.landform = landform;
		this.type = type;
		this.areaOccupied = areaOccupied;
		this.formOfMountain = formOfMountain;
	}

	public Mountain(String name, String location, String type, String formOfMountain) {
		System.out.println("Bean created using constructors of 4agrs");
		this.name = name;
		this.location = location;
		this.type = type;
		this.formOfMountain = formOfMountain;
	}

	public Mountain(String name, double height, String location) {
		System.out.println("Bean created using constructors of 3agrs");
		this.name = name;
		this.height = height;
		this.location = location;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setLandform(String landform) {
		this.landform = landform;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setAreaOccupied(double areaOccupied) {
		this.areaOccupied = areaOccupied;
	}

	public void setFormOfMountain(String formOfMountain) {
		this.formOfMountain = formOfMountain;
	}

	@Override
	public String toString() {
		return "Mountain [name=" + name + ", height=" + height + ", location=" + location + ", landform=" + landform
				+ ", type=" + type + ", areaOccupied=" + areaOccupied + ", formOfMountain=" + formOfMountain + "]";
	}

	public void shelter() {
		System.out.println("shelter invoked");
	}

	public void preventSoilErosion() {
		System.out.println("preventSoilErosion invoked");
	}

}

package com.xworkz.park;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Game {
	private String name;
	private int noOfPlayers;
	private int ageLimit;
	private String type;

//	public Game() {
//		System.out.println("Game Bean created");
//	}

	public Game(@Value("Game-1")String name,@Value("12") int noOfPlayers,@Value("21") int ageLimit,@Value("out") String type) {
		System.out.println("Game Bean created");
		this.name = name;
		this.noOfPlayers = noOfPlayers;
		this.ageLimit = ageLimit;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Game [name=" + name + ", noOfPlayers=" + noOfPlayers + ", ageLimit=" + ageLimit + ", type=" + type
				+ "]";
	}

	public void play() {
		System.out.println("Play invoked");
	}
}

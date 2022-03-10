package com.xworkz.park;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Park {

	private String name;
	private String location;
	private int noOfGates;
	private Game game;
	private Tree tree;

	public Park(@Value("park-1")String name,@Value("bang") String location,@Value("10") int noOfGates,@Autowired Game game, @Autowired Tree tree) {
		System.out.println("Park Bean created");
		this.name = name;
		this.location = location;
		this.noOfGates = noOfGates;
		this.game = game;
		this.tree = tree;
	}

//	public Park() {
//		System.out.println("Park Bean created");
//
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfGates() {
		return noOfGates;
	}

	public void setNoOfGates(int noOfGates) {
		this.noOfGates = noOfGates;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Tree getTree() {
		return tree;
	}

	public void setTree(Tree tree) {
		this.tree = tree;
	}

	@Override
	public String toString() {
		return "Park [name=" + name + ", location=" + location + ", noOfGates=" + noOfGates + ", game=" + game
				+ ", tree=" + tree + "]";

	}

	public void exercise() {
		System.out.println("exercise invoked");

	}

}

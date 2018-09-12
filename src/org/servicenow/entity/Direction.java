package org.servicenow.entity;


public enum Direction {
	EAST("east") , WEST("west"), NORTH("north"),SOUTH("south"),TOP("top"),DOWN("down"); 
	
	
	Direction(String name){
		this.name=name;
	}
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

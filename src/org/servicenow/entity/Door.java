package org.servicenow.entity;

import org.servicenow.interfaces.IDoor;

public class Door implements IDoor {

private String state;
private Direction direction;
public Door(String state,Direction direction){
	this.state=state;
	this.direction=direction;
}

	@Override
	public void open() {
		System.out.println("opening "+direction+"door");
		state="opened";
		
	}

	@Override
	public void close() {
		System.out.println("closing"+direction+ "door");
		state="closed";
		
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " direction "+direction+" State "+state;
	}
	
	

}

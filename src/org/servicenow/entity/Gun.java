package org.servicenow.entity;


public class Gun extends Item {
	public Gun(String name,boolean pickable){
		this.name=name;
		this.pickable=pickable;		
	}
void pick(){
	System.out.println("gun is picked");
}
}

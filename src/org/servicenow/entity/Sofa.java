package org.servicenow.entity;


public class Sofa extends Item {

	public Sofa(String name,boolean type){
		this.name=name;
		this.pickable=type;		
	}
	public void sit(){
	System.out.println("sitting on sofa");
	}
}

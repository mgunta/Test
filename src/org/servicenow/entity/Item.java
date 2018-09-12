package org.servicenow.entity;


public class Item  {
String name;
boolean pickable;
@Override
	public String toString() {
		//System.out.println("name: "+name+"type"+type);
	return " name: "+name+"  type "+pickable+" ";
		
	}
}

package org.servicenow.entity;

import java.util.Arrays;
import java.util.List;


public class Room {
private String name;
private List<Door> doors;
private List<Item> objects;

public List<Item> getObjects() {
	return objects;
}

public void setObjects(List<Item> objects) {
	this.objects = objects;
}

public Room(List<Door> doors,List<Item> objects){
	this.doors=doors;
	this.objects=objects;
	
}

public void describe(){
	System.out.println("This room has "+ doors.size() +" doors "+ Arrays.toString(doors.toArray()));
	System.out.println("This room has "+ objects.size() +" items "+ Arrays.toString(objects.toArray()));
	
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Door> getDoors() {
	return doors;
}

public void setDoors(List<Door> doors) {
	this.doors = doors;
}


}

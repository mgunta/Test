package org.servicenow.commands;

import org.servicenow.entity.Direction;
import org.servicenow.entity.Door;
import org.servicenow.entity.Room;
import org.servicenow.interfaces.Icommand;

public class GoEastCommand implements Icommand {
	Room room;
	public GoEastCommand(Room room){
		this.room=room;
	}

	@Override
	public String execute() {
		for(Door d : room.getDoors()){
			if(d.getDirection().getName().equals(Direction.EAST.getName()))
				d.open();
			
		}
		System.out.println("going east");
		return null;
		
	}

}

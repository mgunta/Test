package org.servicenow.commands;

import org.servicenow.entity.Direction;
import org.servicenow.entity.Door;
import org.servicenow.entity.Room;
import org.servicenow.interfaces.Icommand;

public class GoSouthCommand implements Icommand {
	Room room;
	public GoSouthCommand(Room room){
		this.room=room;
	}

	@Override
	public String execute() {
		for(Door d : room.getDoors()){
			if(d.getDirection().equals(Direction.SOUTH));
			d.open();
			
		}
		System.out.println("going south");
		return null;
		
	}

}

package org.servicenow.commands;

import org.servicenow.entity.Direction;
import org.servicenow.entity.Door;
import org.servicenow.entity.Room;
import org.servicenow.interfaces.Icommand;

public class GoNorthCommand implements Icommand {
	Room room;
	public GoNorthCommand(Room room){
		this.room=room;
	}

	@Override
	public String execute() {
		for(Door d : room.getDoors()){
			if(d.getDirection().equals(Direction.NORTH));
			d.open();
			
		}
		System.out.println("going north");
		return null;
		
	}

}

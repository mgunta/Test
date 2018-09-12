package org.servicenow.commands;

import org.servicenow.entity.Direction;
import org.servicenow.entity.Door;
import org.servicenow.entity.Room;
import org.servicenow.interfaces.Icommand;

public class GoTopCommand implements Icommand {
	Room room;
	public GoTopCommand(Room room){
		this.room=room;
	}

	@Override
	public String execute() {
		for(Door d : room.getDoors()){
			if(d.getDirection().equals(Direction.TOP));
			d.open();
			
		}
		System.out.println("going top");
		return null;
		
	}

}

package org.servicenow.commands;

import org.servicenow.entity.Room;
import org.servicenow.interfaces.Icommand;

public class DescribeRoomCommand implements Icommand {
Room room;
public DescribeRoomCommand(Room room){
	this.room=room;
}
	@Override
	public String execute() {
		room.describe();
		
		return null;
	}

}

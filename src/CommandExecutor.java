import java.util.ArrayList;
import java.util.List;

import org.servicenow.commands.DescribeRoomCommand;
import org.servicenow.commands.GoEastCommand;
import org.servicenow.commands.ShootGunCommand;
import org.servicenow.commands.SitOnSofaCommand;
import org.servicenow.entity.Direction;
import org.servicenow.entity.Door;
import org.servicenow.entity.Gun;
import org.servicenow.entity.Item;
import org.servicenow.entity.Room;
import org.servicenow.entity.Sofa;
import org.servicenow.interfaces.Icommand;

public class CommandExecutor {
	
public static void main(String[] args) {
	
	List<Door>doors= new ArrayList<Door>();
	doors.add(new Door("closed",Direction.EAST));
	doors.add(new Door("closed",Direction.WEST));
	doors.add(new Door("closed",Direction.SOUTH));
	doors.add(new Door("closed",Direction.NORTH));
	doors.add(new Door("closed",Direction.TOP));
	doors.add(new Door("closed",Direction.DOWN));

	List<Item>items= new ArrayList<Item>();
	items.add(new Gun("ak47",true));
	items.add(new Sofa("sofa1",false));
	Room room = new Room(doors,items);
	
	//execute commands
	Icommand cmd= new DescribeRoomCommand(room);
	cmd.execute();
	
	 cmd= new GoEastCommand(room);
	 cmd.execute();

	 cmd= new SitOnSofaCommand(new Sofa("sofa1",false));
	 cmd.execute();
	 
	 cmd = new ShootGunCommand(new Gun("ak47",true));
	 cmd.execute();
	
	
}

}

package org.servicenow.commands;

import org.servicenow.entity.Gun;
import org.servicenow.interfaces.Icommand;

public class PickGunCommand implements Icommand {
	Gun gun;
	public PickGunCommand(Gun gun){
		this.gun=gun;
	}

	@Override
	public String execute() {
		System.out.println("picking the gun");
		return null;
		
	}

}

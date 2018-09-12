package org.servicenow.commands;

import org.servicenow.entity.Gun;
import org.servicenow.interfaces.Icommand;

public class ShootGunCommand implements Icommand {
	Gun gun;
	public ShootGunCommand(Gun gun){
		this.gun=gun;
	}

	@Override
	public String execute() {
		System.out.println("shooting the gun");
		return null;
		
	}

}

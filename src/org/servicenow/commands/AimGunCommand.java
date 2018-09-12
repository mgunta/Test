package org.servicenow.commands;

import org.servicenow.entity.Gun;
import org.servicenow.interfaces.Icommand;

public class AimGunCommand implements Icommand {
	Gun gun;
	AimGunCommand(Gun gun){
		this.gun=gun;
	}

	@Override
	public String execute() {
		System.out.println("Aiming the gun");
		return null;
		
	}

}

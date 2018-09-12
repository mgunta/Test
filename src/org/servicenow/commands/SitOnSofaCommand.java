package org.servicenow.commands;

import org.servicenow.entity.Sofa;
import org.servicenow.interfaces.Icommand;

public class SitOnSofaCommand  implements Icommand{
Sofa sofa;

public SitOnSofaCommand(Sofa sofa) {
	this.sofa= sofa;
}
@Override
public String execute() {
		sofa.sit();

	return null;
	}
	
}

package model;
/*
 * List of available commands
 */
public enum CommandList {
	
	LOGIN(new LoginCommand()),
	REGISTER(new RegisterCommand());
	
	private Command command;
	
	CommandList(Command command){
		this.command = command;
	}
	
	public Command getCommand() {
		return command;
	}
}

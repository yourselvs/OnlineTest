package cmdLineInterpreter;

import java.util.List;

public class Command {
	private String action;
	private List<String> args;
	
	public Command(String command, List<String> args2){
		this.action = command;
		this.args = args2;
	}
	
	public String getCommand() {return action;}
	public List<String> getArgs() {return args;}
}

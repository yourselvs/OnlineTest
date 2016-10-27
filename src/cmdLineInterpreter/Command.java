package cmdLineInterpreter;

public class Command {
	private String command;
	private String[] args;
	
	public Command(String command, String[] args){
		this.command = command;
		this.args = args;
	}
	
	private String getCommand() {return command;}
	private String[] getArgs() {return args;}
}

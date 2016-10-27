package cmdLineInterpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * By running the main method of this class we will be able to
 * execute commands associated with the SystemManager.  This command
 * interpreter is text based. 
 *
 */
public class Interpreter {
	private static CommandManager cmdManager;
	private static Scanner kb;

	public static void main(String[] args) {
		cmdManager = new CommandManager();
		kb = new Scanner(System.in);
		
		while(true) {
			cmdManager.runCommand(parseCommand(kb.nextLine()));
		}
	}
	
	private static Command parseCommand(String input) {
		Scanner cmdScanner = new Scanner(input);
		
		if(!cmdScanner.hasNext()) {
			cmdScanner.close();
			return null;
		}
		
		String command = "";
		List<String> args = new ArrayList<String>();
		
		command = cmdScanner.next();
		
		while(cmdScanner.hasNext()) {
			args.add(cmdScanner.next());
		}
		
		cmdScanner.close();
		return new Command(command, args);
	}
}

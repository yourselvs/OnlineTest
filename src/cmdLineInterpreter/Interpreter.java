package cmdLineInterpreter;

import onlineTest.Manager;
import onlineTest.SystemManager;

/**
 * 
 * By running the main method of this class we will be able to
 * execute commands associated with the SystemManager.  This command
 * interpreter is text based. 
 *
 */
public class Interpreter {
	private static Manager manager;

	public static void main(String[] args) {
		manager = new SystemManager();
	}
}

package Shadow;

import Shadow.System.Debug.ErrorLog;
import Shadow.System.Script.ShadowCommand;
import Shadow.System.Script.ShadowParser;

public class Application {
	public static void main(String[] args) {
		ShadowEngine engine = new ShadowEngine();
		
		ShadowCommand.run("echo the command string");
		ShadowCommand.run("add 1.337 3.14");
		ShadowCommand.run("initviewport 800 600 0");
		
		System.out.println("Parser tokenizer test: " + ShadowParser.getToken("echo this is a test", 0));
		System.out.println("Testing the tokenizer: " + ShadowParser.removeKey("echo my child"));
		
		ShadowEngine.report("Error test!");
		ErrorLog.dumpToFile();
	}
}

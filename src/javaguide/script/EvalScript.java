package javaguide.script;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class EvalScript {
	public static void main(String[] args) throws Exception {
		// create a script engine manager
		ScriptEngineManager sem = new ScriptEngineManager();
		// create a Nashorn script engine
		ScriptEngine se = sem.getEngineByName("nashorn");
		// evaluate JavaScript statement
		try {
			se.eval("print('Hello, World!');");
		} catch (final ScriptException e) {
			e.printStackTrace();
		}
	}
}
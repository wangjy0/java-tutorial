package javaguide.script;

import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class EvalScript {
	public static void main(String[] args) throws Exception {
		ScriptEngineManager manager = new ScriptEngineManager();  
		List<ScriptEngineFactory> factories = manager.getEngineFactories();  
		for (ScriptEngineFactory f : factories) {  
		    System.out.println("egine name:" + f.getEngineName() + "\n"  
		            + "engine version:" + f.getEngineVersion() + "\n"  
		            + "language name:" + f.getLanguageName());  
		}  
		
		
		// create a script engine manager
		ScriptEngineManager sem = new ScriptEngineManager();
		// create a Nashorn script engine
		ScriptEngine se = sem.getEngineByName("javascript");
		// evaluate JavaScript statement
		try {
			se.put("a", 4);  
			se.put("b", 6);  
			Object val = se.eval("a+b");
			System.out.println(val);
		} catch (final ScriptException e) {
			e.printStackTrace();
		}
		
	}
}
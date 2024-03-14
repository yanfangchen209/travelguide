package demo.scopeAndInitialization;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//prototype enables create different beans.
@Component
@Scope("prototype")
public class MyPrototypeComponent{
	private static int nextId = 0;
	private int id = nextId++;
	
	public MyPrototypeComponent() {
		System.out.printf("prototype Component bean %d created\n", id);
	}
	
	@Override
	public String toString() {
		return String.format("prototype component %d", id);
	}

	
}
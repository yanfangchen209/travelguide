package demo.scopeAndInitialization;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		

		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		//demoSingleton(ctx);
		//demoPrototype(ctx);

	}
	
	private static void demoSingleton(ApplicationContext ctx) {

		MySingletonComponent bean1 = ctx.getBean("mySingletonComponent", MySingletonComponent.class);
		MySingletonComponent bean2 = ctx.getBean("mySingletonComponent", MySingletonComponent.class);
		MySingletonComponent bean3 = ctx.getBean("mySingletonComponent", MySingletonComponent.class);
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean3);
				
	}
	
	//For each call to getBean(), Spring creates a new bean
	private static void demoPrototype(ApplicationContext ctx) {
		MyPrototypeComponent bean1 = ctx.getBean("myPrototypeComponent", MyPrototypeComponent.class);
		MyPrototypeComponent bean2 = ctx.getBean("myPrototypeComponent", MyPrototypeComponent.class);
		MyPrototypeComponent bean3 = ctx.getBean("myPrototypeComponent", MyPrototypeComponent.class);
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean3);
	}
	


}

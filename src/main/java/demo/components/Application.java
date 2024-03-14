package demo.components;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//without lazy annotation, spring created beans when application start up even without use of bean like ctx.getBean
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		
		//return a context object which contains created beans when application start up
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		//typically we have multiple beans of the same type
		
		MyComponent beanRef = ctx.getBean("myComponent", MyComponent.class);
		//MyComponent beanRef = ctx.getBean("coolBean", MyComponent.class);
		//if the component only have one name: MyComponent beanRef = ctx.getBean(MyComponent.class);
		System.out.println(beanRef);
		
	}
	


}

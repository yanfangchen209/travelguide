package demo.scopeAndInitialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*@Scope("singleton") can be omitted. because singleton is default. only one instance is created.
 * Singleton beans are created at application start-up
For each call to getBean(), you get the same bean

*You can tell Spring to Avoids creating beans until needed
when instantiate a singleton bean to Speeds start-up time
Annotate the component class with @Lazy
*
*/

//without lazy and use of instance, spring will automatically create bean of singleton instance
//with layz, spring only create when it is needed.
@Component
@Lazy
@Scope("singleton")
public class MySingletonComponent {
    private static int nextId;
    private int id = nextId++;

    public MySingletonComponent() {
        System.out.printf("MySingletonComponent bean %d created\n", id);
    }

    @Override
    public String toString() {
        return String.format("Hi from MySingletonComponent %d", id);
    }
}
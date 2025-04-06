package SpringLifeCycleMethodsByInterfaceUsing;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeCycleMethod.xml");
       // ByUsingInterface abc =(ByUsingInterface) context.getBean("S");
        ByUsingInterface byUsingInterface=context.getBean(ByUsingInterface.class);
        System.out.println(byUsingInterface);
        context.registerShutdownHook();
    }
}

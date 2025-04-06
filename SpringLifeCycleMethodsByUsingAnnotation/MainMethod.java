package SpringLifeCycleMethodsByUsingAnnotation;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {
    public static void main(String[] args) {
        AbstractApplicationContext cont = new ClassPathXmlApplicationContext("LifeCycleMethod.xml");
        Nature pub =  cont.getBean(Nature.class);
        System.out.println(pub);
        cont.registerShutdownHook();
    }
}

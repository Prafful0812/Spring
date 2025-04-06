package SpringLifeCycleMethodsByXMLUsing;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("LifeCycleMethod.xml");
//        Samosa ss = (Samosa) context.getBean("S1");
//        System.out.println(ss);

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeCycleMethod.xml");
        Samosa ss = (Samosa) context.getBean(Samosa.class);
        System.out.println(ss);
        context.registerShutdownHook();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


    }
}

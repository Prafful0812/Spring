package BeanScopeByXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cont = new ClassPathXmlApplicationContext("BeanScope.xml");

        SingletonByXML sg = cont.getBean("singleton", SingletonByXML.class);
        System.out.println(sg);
        System.out.println(sg.hashCode());
        SingletonByXML sg1 = cont.getBean("singleton", SingletonByXML.class);
        System.out.println(sg1);
        System.out.println(sg1.hashCode());
        System.out.println("====Prototype====");

        PrototypeByXML prop = cont.getBean("prototype", PrototypeByXML.class);
        System.out.println(prop);
        System.out.println(prop.hashCode());

        PrototypeByXML prop1 = cont.getBean("prototype", PrototypeByXML.class);
        System.out.println(prop1);
        System.out.println(prop1.hashCode());
    }
}

package BeanScopeByAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cont = new ClassPathXmlApplicationContext("BeanScope.xml");

        System.out.println("====Singleton====");
//        Singleton
        Singleton sg = cont.getBean("singleton", Singleton.class);
        System.out.println(sg);
        System.out.println(sg.hashCode());

        Singleton sg1 = cont.getBean("singleton", Singleton.class);
        System.out.println(sg1);
        System.out.println(sg1.hashCode());
        System.out.println("====Prototype====");

//        Prototype
        Prototype prop = cont.getBean("prototype", Prototype.class);
        System.out.println(prop);
        System.out.println(prop.hashCode());

        Prototype prop1 = cont.getBean("prototype", Prototype.class);
        System.out.println(prop1);
        System.out.println(prop1.hashCode());
    }
}

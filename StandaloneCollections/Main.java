package StandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cont = new ClassPathXmlApplicationContext("Standalone.xml");
        Sports sp = cont.getBean(Sports.class);
        System.out.println(sp);
        System.out.println(sp.getSports().getClass().getName());

        Sports sp1 = cont.getBean(Sports.class);
        System.out.println(sp1);
        System.out.println(sp1.getLocation().getClass().getName());

        Sports sp2 = cont.getBean(Sports.class);
        System.out.println(sp2);
        System.out.println(sp2.getProps().getClass().getName());
    }
}

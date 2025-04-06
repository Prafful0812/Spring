package ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext cont = new ClassPathXmlApplicationContext("ConstInjection.xml");

        Resident resi = (Resident) cont.getBean("resident");
        System.out.println(resi);
    }
}

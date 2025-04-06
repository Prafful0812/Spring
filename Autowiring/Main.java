package Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cont = new ClassPathXmlApplicationContext("AutoWiring.xml");
        Employee emp = cont.getBean(Employee.class);
        System.out.println(emp);
    }
}

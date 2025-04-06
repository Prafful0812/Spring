package SpringCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext cont = new ClassPathXmlApplicationContext("Spring.Collection.xml");
        Student std = (Student) cont.getBean("Student");
        System.out.println(std.getId());
        System.out.println(std.getNumbers());
        System.out.println(std.getAddress());
        System.out.println(std.getCourse());
        System.out.println(std.getProps());
    }
}

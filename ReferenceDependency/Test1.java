package ReferenceDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("RefDependency.xml");
        A a = (A) con.getBean("Aref");
        System.out.println(a.getX());

        System.out.println(a.getOb().getY());
        System.out.println(a);

    }
}

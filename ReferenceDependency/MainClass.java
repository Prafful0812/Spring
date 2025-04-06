package ReferenceDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        ApplicationContext cont = new ClassPathXmlApplicationContext("RefDependency.xml");

        Employee emp = (Employee) cont.getBean("EmployeeRef");
        System.out.println(emp.getEmp_id());
        System.out.println(emp.getObj().getComp_id());
        System.out.println(emp);
    }
}

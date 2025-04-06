package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        SpStudents student1 = (SpStudents)context.getBean("student1");
        System.out.println(student1);
        SpStudents student2 = (SpStudents)context.getBean("student2");
        System.out.println(student2);
        SpStudents student3 = (SpStudents)context.getBean("student3");
        System.out.println(student3);
    }
}

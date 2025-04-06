package ConstructorAmbiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("ConstructorAmbiguity.xml");
        Addition ad = con.getBean(Addition.class);
        ad.doSum();
    }
}

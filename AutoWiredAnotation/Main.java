package AutoWiredAnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext contt = new ClassPathXmlApplicationContext("AutoWiredAnotation.xml");
        Collage clg = contt.getBean(Collage.class);
        System.out.println(clg);
    }
}

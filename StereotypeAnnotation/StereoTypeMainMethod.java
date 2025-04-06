package StereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTypeMainMethod {
    public static void main(String[] args) {
        ApplicationContext cont = new ClassPathXmlApplicationContext("StereoType.xml");

        District dist = cont.getBean("district", District.class);
        System.out.println(dist);
        System.out.println(dist.getAddress().get(0));
        System.out.println(dist.getAddress().getClass().getName());
    }
}

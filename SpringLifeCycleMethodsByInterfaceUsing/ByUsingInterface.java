package SpringLifeCycleMethodsByInterfaceUsing;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ByUsingInterface implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ByUsingInterface(double price) {
        this.price = price;
    }

    public ByUsingInterface() {
    }

    @Override
    public String toString() {
        return "ByUsingInterface{" +
                "price=" + price +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init");
    }
}

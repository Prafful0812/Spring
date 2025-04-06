package ConstructorInjection;

public class Society {
    private String name;

    public Society(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Society{" +
                "name='" + name + '\'' +
                '}';
    }
}

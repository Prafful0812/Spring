package org.example;

public class SpStudents {
    private int id;
    private String name;
    private String address;

    public SpStudents(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public SpStudents(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Id set");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Name set");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("Address set");
        this.address = address;
    }

    @Override
    public String toString() {
        return "SpStudents{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

package ReferenceDependency;

public class Employee {
    private int emp_id;

    private Company obj;

    public Employee(){

    }
    public Employee(int emp_id, Company obj) {
        this.emp_id = emp_id;
        this.obj = obj;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public Company getObj() {
        return obj;
    }

    public void setObj(Company obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", obj=" + obj +
                '}';
    }
}

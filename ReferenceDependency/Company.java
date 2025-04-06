package ReferenceDependency;

public class Company {

    private int comp_id;

    public Company(){

    }

    public Company(int comp_id) {
        this.comp_id = comp_id;
    }

    public int getComp_id() {
        return comp_id;
    }

    public void setComp_id(int comp_id) {
        this.comp_id = comp_id;
    }

    @Override
    public String toString() {
        return "Company{" +
                "comp_id=" + comp_id +
                '}';
    }
}

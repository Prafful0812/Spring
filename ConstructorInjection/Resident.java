package ConstructorInjection;

public class Resident {
    private String Resident_name;
    private int no_of_resident;
    private Society society;

    public Resident(String resident_name, int no_of_resident, Society society) {
        this.Resident_name = resident_name;
        this.no_of_resident = no_of_resident;
        this.society = society;
    }

    @Override
    public String toString() {
        return "Resident{" +
                "Resident_name = '" + Resident_name + '\'' +
                ", no_of_resident = " + no_of_resident + '\'' +
                ", society = " + society +
        '}';
    }
}

package SpringCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
    private String id;
    private List<String> numbers;
    private Set<String> Address;
    private Map<String,String> course;
    private Properties props;

    public Student(String id, List<String> numbers, Set<String> address, Map<String, String> course, Properties props) {
        this.id = id;
        this.numbers = numbers;
        Address = address;
        this.course = course;
        this.props = props;
    }

    public Student(){

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public Set<String> getAddress() {
        return Address;
    }

    public void setAddress(Set<String> address) {
        Address = address;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", numbers=" + numbers +
                ", Address=" + Address +
                ", course=" + course +
                ", props=" + props +
                '}';
    }
}

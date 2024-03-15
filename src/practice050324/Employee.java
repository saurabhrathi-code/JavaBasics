package practice050324;

import java.util.List;
import java.util.StringJoiner;

public class Employee {

    private String name;
    private  int age;
    private List<Integer> phoneNo;

    public Employee(String name, int age, List<Integer> phoneNo) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Integer> getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(List<Integer> phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .add("phoneNo=" + phoneNo)
                .toString();
    }
}

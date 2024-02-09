package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class que6 {
    public static void main(String[] args) {
        List<Employee> list1 = Arrays.asList(
                new Employee(1,"Sanket", 'M', 5000000),
                new Employee(2,"Ani", 'M', 3000000),
                new Employee(3,"Aman", 'M', 4000000)
        );

        Optional<Employee> employee = list1.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println(employee);
    }
}

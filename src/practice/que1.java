package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class que1 {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee(1,"saurabh", 'M', 2000000),
                new Employee(2,"Ankit", 'M', 2000000),
                new Employee(3,"Aman", 'M', 2000000)
        );

        List<Employee> output = emp.stream()
                .filter(x->x.getName().startsWith("A"))
                .collect(Collectors.toList());

        output.forEach(System.out::println);

    }
}

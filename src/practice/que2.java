package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class que2 {
    public static void main(String[] args) {
        List<Employee> list1 = Arrays.asList(
                new Employee(1,"Sanket", 'M', 5000000),
                new Employee(2,"Ani", 'M', 3000000),
                new Employee(3,"Aman", 'M', 4000000)
        );

        List<Employee> list2 = Arrays.asList(
                new Employee(1,"saurabh", 'M', 5000000),
                new Employee(2,"Ankit", 'M', 100000),
                new Employee(3,"Adi", 'M', 200000)

        );

        List<Employee> merged = Stream.concat(list1.stream(),list2.stream())
                .sorted(Comparator.comparing(e -> e.getSalary()))
                .collect(Collectors.toList());
        merged.forEach(System.out::println);
    }
}

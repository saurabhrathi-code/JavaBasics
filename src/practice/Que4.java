package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Que4 {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(5,"saurabh", 'M', 2000000),
                new Employee(8,"Ankit", 'M', 2000000),
                new Employee(1,"Aman", 'M', 2000000),
                new Employee(16,"aditi", 'F', 2000000),
                new Employee(2,"anu", 'F', 2000000)
        ) ;

        List<Employee> employeesSort = list.stream()
                .sorted(Comparator.comparingInt(i->i.getId()))
                .collect(Collectors.toList());

        employeesSort.forEach(System.out::println);

    }
}

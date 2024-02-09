package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class que5 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee e = new Employee(1,"saurabh",'M',1000000000);
        Employee e2 = new Employee(2,"nayan",'M', 453333330);
        Employee e3 = new Employee(3,"naina",'F', 41333333);
        Employee e4 = new Employee(4,"nihal",'M', 42333333);
        list.add(e);
        list.add(e2);
        list.add(e4);
        list.add(e3);

        List<Employee> sort = list.stream()
                .filter(sal -> sal.getSalary()>41333333)
                .sorted(Comparator.comparing(name -> name.getName()))
                .collect(Collectors.toList());

        sort.forEach(System.out::println);



    }
}

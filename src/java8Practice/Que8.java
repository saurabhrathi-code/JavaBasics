package java8Practice;

import java8Practice.modal.Employee1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Que8 {
    public static void main(String[] args) {

        List<Employee1> employee1List = Arrays.asList(
                new Employee1("sam", 25, Arrays.asList("1234567891", "9876543210")),
                new Employee1("sam", 25, Arrays.asList("1434567891", "9776543210")),
                new Employee1("sam", 25, Arrays.asList("1534567891", "9676543210")));

        List<String> collect = employee1List.stream()
                .flatMap(p -> p.getPhoneNumber().stream()).collect(Collectors.toList());

        System.out.println(collect);
    }

}

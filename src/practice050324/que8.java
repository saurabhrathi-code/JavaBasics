package practice050324;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*8. Write a program to a Flattering list of objects.*/
public class que8 {
    public static void main(String[] args) {

        List<Employee> employee = Arrays.asList(
                new Employee("A", 21, Arrays.asList(123,1234,12345)),
                new Employee("B", 6, Arrays.asList(111,1211)),
                new Employee("C", 32, Arrays.asList(222,1222,1234522)),
                new Employee("D", 23, Arrays.asList(333,123433,1234533)),
                new Employee("E", 27, Arrays.asList(444,123444,12345432))
                );

        List<Integer> collect = employee.stream()

                //.map(e -> e.getPhoneNo()).collect(Collectors.toList());
        .flatMap(e -> e.getPhoneNo().stream()).collect(Collectors.toList());

        System.out.println(collect);

    }
}

package practice050324;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
2. Write a program to print duplicate numbers.
*/
public class que2 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,5,3,2,5,6,73,2,1);

        Set<Integer> integerSet = new HashSet<>();
        Set<Integer> collect = integerList.stream()
                .filter(i -> !(integerSet.add(i)))
                .sorted().collect(Collectors.toSet());
        System.out.println(integerSet);
        System.out.println(collect);

    }

}

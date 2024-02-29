package java8Practice;

import java.util.Arrays;
import java.util.List;

public class Que17 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,3,4,4,55,67,7,843,2,1);

        long count = integerList.stream().distinct().count();

        System.out.println(count);
    }
}

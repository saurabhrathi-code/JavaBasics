package java8Practice;

import java.util.Arrays;
import java.util.List;

public class Que13 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Integer reduce = integerList.stream().reduce(100, Integer::sum);
        System.out.println(reduce);
    }
}

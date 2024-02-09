package practice;

import java.util.Arrays;
import java.util.List;

public class que3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int a = list.stream()
                .filter(e-> e%2==0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(a);
    }
}
package java8Practice;

import java.util.Arrays;
import java.util.Comparator;

public class Que6 {

    public static void main(String[] args) {

        int [] arr = {};

        int asInt = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                //.orElseThrow();
                //.orElse(Integer.MAX_VALUE);
                .get();

        System.out.println(asInt);



    }

}

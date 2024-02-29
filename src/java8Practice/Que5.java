package java8Practice;

import java.util.Arrays;
import java.util.OptionalInt;

public class Que5 {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8};

        OptionalInt max = Arrays.stream(arr).max();
        System.out.println(max.getAsInt());

        OptionalInt min = Arrays.stream(arr).min();
        System.out.println(min.getAsInt());
    }
}

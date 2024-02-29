package java8Practice;

import java.util.Arrays;

//6. Write a program to find the second-highest number in an array.
public class Que7 {
    public static void main(String[] args) {

        int [] arr = {12,3,4,5,6,7,8};

        int integer = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .get();

        System.out.println(integer);
    }
}

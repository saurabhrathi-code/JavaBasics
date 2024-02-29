package java8Practice;

import java.util.Arrays;

public class Que9 {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};

        Arrays.stream(arr).filter(x-> x%2 ==0).forEach(System.out::println);
    }
}

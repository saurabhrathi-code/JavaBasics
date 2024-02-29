package java8Practice;

import java.util.Arrays;

public class Que10 {
    public static void main(String[] args) {

       // int [] arr = {1,2,3,4,5,6,7,8,8};
        int [] arr = {1,2,3,4,5,6,7,8};

        boolean b = Arrays.stream(arr).distinct().count() != arr.length;

        System.out.println(b);

    }
}

package practice050324;

import java.util.Arrays;

/*7. Write a program to Find the Second-Lowest Number.*/
public class que7 {
    public static void main(String[] args) {

        int arr[] = {1,7,3,4,5,6,67,7,2};

        int integer = Arrays.stream(arr).boxed().sorted().skip(1).findFirst().orElse(Integer.MIN_VALUE);

        System.out.println(integer);


    }
}

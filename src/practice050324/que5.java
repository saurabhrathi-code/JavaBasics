package practice050324;

import java.util.Arrays;
import java.util.OptionalInt;

public class que5 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};

        OptionalInt min = Arrays.stream(arr).min();
        System.out.println(min.getAsInt());

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);



    }
}

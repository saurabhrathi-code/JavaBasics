package practice050324;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*10.  Given an integer array nums, return true if
 any value appears at least twice in the array, and return false if every element is distinct.*/
public class que10 {
    public static void main(String[] args) {

        //int[] arr= {1,2,3,4,5,6,7,8,9,1,2,3,4};
        int[] arr = {1,2,3,4,5,6,7};

        boolean b = Arrays.stream(arr).distinct().count() != arr.length;

        System.out.println(b);


    }
}

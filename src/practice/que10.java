package practice;

import java.util.HashSet;
import java.util.Set;

public class que10 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr2 ={1,2,4,6,8,15,15,18,21,54};

        Set<Integer> set = new HashSet<>();
        for (int a:arr) {
            set.add(a);
        }

        for (int a:arr2) {
            set.add(a);
        }

        int[] ints = set.stream().mapToInt(Integer::intValue).toArray();
        for (int a : ints) {
            System.out.println(a);
        }

    }
}

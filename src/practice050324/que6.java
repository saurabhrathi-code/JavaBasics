package practice050324;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*6. Write a program to find the second-highest number in an array. */
public class que6 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8};
        int first =
                Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(Integer.MAX_VALUE);
        System.out.println(first);
    }
}

package practice050324;

import java.util.Arrays;
import java.util.List;

/*9. Write a program to Print Even Numbers.*/
public class que9 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        integerList.stream().filter(n -> n % 2  == 0 ).forEach(System.out::println);
    }
}

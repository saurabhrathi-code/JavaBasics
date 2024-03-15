package practice050324;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*11. Write a program to sort the 2 lists in descending order.*/
public class que11 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(54,2,3,4,5,7,9,2,4,61,1);

        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<String> stringList = Arrays.asList("A","B","C","D","E","F","G");

        stringList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}

package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();

        numberList.add(5);
        numberList.add(2);
        numberList.add(8);
        numberList.add(null);

        numberList.remove(Integer.valueOf(2));

        // Sorting the list
        Collections.sort(numberList);

        //Searching element
        int index = numberList.indexOf(8);
        System.out.println("index "+index); //index 1

        for (int number : numberList) {
            System.out.println(number); // 5 8
        }
    }
}

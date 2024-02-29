package java8Practice;

import java.util.Arrays;
import java.util.List;

public class Que14 {
    public static void main(String[] args) {

        List<Character> characterList = Arrays.asList('A','B','C');

        characterList.stream().map(ch-> ch + "_"+(char)(ch+23)).forEach(System.out::println);
    }
}

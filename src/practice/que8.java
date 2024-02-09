package practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class que8 {
    public static void main(String[] args) {

        Character [] ch = {'a','1','2','b','c','d','5','7','8'};

        Arrays.stream(ch)
                .filter(Character::isDigit)
                .forEach(System.out::print);

    }
}

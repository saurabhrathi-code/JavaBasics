package practice050324;

import java.util.LinkedHashMap;
import java.util.Map;

/*
1.
Given a String, find the first non-repeated character in it using Stream functions?
String input = "Java articles are Awesome";
*/
public class que1 {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";

        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();

        input.chars().mapToObj(c -> (char) c).forEach(ch -> characterIntegerMap.merge(ch, 1, Integer::sum));

        Character characterIntegerEntry = characterIntegerMap.entrySet().stream()
                .filter(ch -> ch.getValue() == 1)
                .map(ch -> ch.getKey())
                .findFirst()
                .orElse(null);

        System.out.println(characterIntegerEntry);
    }
}

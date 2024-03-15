package practice050324;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*4. Given a String, find the first repeated character in it using Stream functions?
String input = "Java articles are Awesome";*/
public class que4 {
    public static void main(String[] args) {

        String input = "Java programming language";
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();
        input.chars()
                .mapToObj(ch -> (char)ch)
                .forEach(ch -> characterIntegerMap.merge(ch, 1, Integer::sum));
        System.out.println(characterIntegerMap);

        Character characterIntegerEntry = characterIntegerMap.entrySet()
                .stream()
                .filter(v -> v.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(characterIntegerEntry);
    }
}

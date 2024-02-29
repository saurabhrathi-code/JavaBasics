package java8Practice.practice2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Que1 {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";

        HashMap<Character, Integer> characterCountHashMap = new LinkedHashMap<>();


        input.chars().mapToObj(c-> (char)c).forEach(ch -> characterCountHashMap.merge(ch, 1, Integer::sum));

        Character character = characterCountHashMap.entrySet().stream()
                .filter(c -> c.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(character);
    }
}

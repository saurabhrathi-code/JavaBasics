package java8Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class Que4 {
    public static void main(String[] args) {

        String str = "Javaa aJtiwmosAclrticle are Awesome";

        HashMap<Character, Integer> characterCount = new LinkedHashMap<>();

        str.chars()
                .mapToObj(c -> (char) c)
                .forEach(ch -> characterCount.merge(ch, 1,Integer::sum ));

        Character character = characterCount.entrySet().stream()
                .filter(v -> v.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(character);

    }
}

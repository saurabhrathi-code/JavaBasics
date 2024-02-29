package java8Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//1. Given a String, find the first non-repeated character in it using Stream functions?
//String input = "Java articles are Awesome";
public class Que1 {
    public static void main(String[] args) {

        String str = "Java aJtiwmosAclrticle are Awesome";

        HashMap<Character, Integer> characterCount = new LinkedHashMap<>();

        str.chars().mapToObj(c-> (char) c).forEach(ch -> characterCount.merge(ch,1,Integer::sum));

        Character character = characterCount.entrySet().stream()
                .filter(c -> c.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(character);


    }
}

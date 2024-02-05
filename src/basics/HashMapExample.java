package basics;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> ageMap = new HashMap<>();

        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 22);
        ageMap.put(null,1);

        ageMap.remove("Bob");

        //Searching by key
        boolean containsAlice = ageMap.containsKey("Alice");
        System.out.println(containsAlice); // True

        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue()); // Alice:25 Charlie:22
        }
    }
}

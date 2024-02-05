package basics;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
    public static void main(String[] args) {

        HashSet<String> nameSet = new HashSet<>();

        nameSet.add("Alice");
        nameSet.add("Bob");
        nameSet.add("Charlie");
        nameSet.add("Alice"); // duplicates not allowed
        nameSet.add(null);

        nameSet.remove("Bob");

        boolean containsCharlie = nameSet.contains("Charlie");
        System.out.println(containsCharlie);

        //Enhanced for loop
        for (String name : nameSet) {
            System.out.println(name);
        }

        //OR The iterator() method is used to find the iterator of the set.
        // The iterator is used to get the element one by one.

        Iterator iterator = nameSet.iterator();
        System.out.println("Using Iterator: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

package practice050324;

import java.util.stream.IntStream;

/*3. Write a program to find whether a string or number is palindrome or not.*/
public class que3 {
    public static void main(String[] args) {

        String str = "abba";

        String s = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        boolean b = IntStream.range(0, s.length() / 2)
                .allMatch(i -> s.charAt(i) == s.charAt(s.length() - 1 - i));

        System.out.println(b);
    }
}

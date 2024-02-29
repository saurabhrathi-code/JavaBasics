package java8Practice.practice2;

import java.util.stream.IntStream;

public class Que3 {
    public static void main(String[] args) {

        String inputStr = "leve$l";

        int inputInteger = 1221;

        //String inputString = inputStr.toString();

        String cleanString = inputStr.replaceAll("[^a-zA-Z0-9]","");

        boolean b = IntStream.range(0, cleanString.length() / 2)
                .allMatch(i -> cleanString.charAt(i) == cleanString.charAt(cleanString.length() - 1 - i));

        System.out.println(b);


    }
}

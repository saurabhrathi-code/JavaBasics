package java8Practice;

import java.util.stream.IntStream;

public class Que3 {
    public static void main(String[] args) {

        String inputString = "l$eVel";
        int inputNumber = 123321;

        String string = Integer.toString(inputNumber);


        String cleanString = inputString.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        boolean b = IntStream.range(0, cleanString.length() / 2)
                .allMatch(i -> cleanString.charAt(i) == cleanString.charAt(cleanString.length() - 1 - i));

        System.out.println(b);


    }
}

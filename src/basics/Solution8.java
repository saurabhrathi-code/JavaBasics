package basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution8 implements Opps{
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,32,43,65,23,13,15,87,15,18);

        List<Integer> out = list.stream().filter(x -> x>20).collect(Collectors.toList());

        for (int num:out) {
            System.out.println(num);
        }
    }

    @Override
    public int print() {
        return 0;
    }
}

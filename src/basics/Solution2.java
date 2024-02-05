package basics;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> list = new ArrayList<Long>();
        long fact = 1;
        int i = 1;
        return factPrint(n, list, fact, i);
    }

    public static List<Long> factPrint(long n, List<Long> list, long fact, int i) {
        i++;
        if (fact > n) return list;
        list.add(fact);
        factPrint(n, list, fact * i, i);
        return list;
    }

    public static void main(String[] args) {
       List<Long> longList =  factorialNumbers(7);
        System.out.println(longList);
    }
}
package basics;

public class Solution1 {
    public static long sumFirstN(long n) {
        // Write your code here.
        long  sum=0;
        return sumAll(n, sum);
    }

    public static long sumAll(long n, long sum) {
        if(n<1) {
            return sum;
        }
        return sumAll(n-1, sum+n);
    }

    public static void main(String[] args) {
        long n = sumFirstN(5);
        System.out.println(n);
    }
}
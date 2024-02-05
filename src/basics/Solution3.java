package basics;

public class Solution3 {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        return isPalin(str, 0, str.length());
    }
    public static boolean isPalin(String str, int start, int end) {
        if (start>end) return true;
        if (str.charAt(start) != str.charAt(end-1)) {
            return false;
        }
        return isPalin(str, start+1, end-1);

    }
}

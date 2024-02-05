package basics;

public class Solution6 {

    public static int charCount(char ch, String s) {

        //brut force
        int count = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ch) {
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int ch = charCount('d', "aabca");
        System.out.println(ch);
    }
}

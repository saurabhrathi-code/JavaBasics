package basics;

import java.util.ArrayList;

public class Solution {
    public static void seeding1(int n) {
        // Write your code here
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=n-row+1; col++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void nStarTriangle(int n) {
        // Write your code here
        for (int row=0; row<n; row++){
            //space
            for (int col=0; col<row; col++) {
                System.out.print(" ");
            }
            //star
            for (int col=0; col<(2*n)-(2*row+1); col++) {
                System.out.print("*");
            }
            //space
            for (int col=0; col<row; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void nStarDiamond(int n) {
        for (int row=1; row<=n; row++) {

            //space
            for (int col=1; col<n-row+1;col++) {
                System.out.print(" ");
            }

            //stars
            for (int col=1; col<=(2*row)-1;col++){
                System.out.print("*");
            }

            //space
            for (int col=1; col<n-row;col++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int row=0; row<n; row++) {
            //space
            for (int col=0; col<row;col++) {
                System.out.print(" ");
            }
            //stars
            for (int col=0; col<(2*n)-(2*row+1);col++){
                System.out.print("*");
            }
            //space
            for (int col=0; col<row;col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void nStarTriangleone(int n) {
        // Write your code here
        for (int row=1; row<=n; row++) {
            for (int col=1; col<=row; col++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int row=1; row<n; row++) {
            for (int col=1; col<=n-row; col++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void symmetry(int n) {
        // Write your code here
        int iniS = 0;
        for (int row = 1; row <= n; row++) {

            //star
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }

            //space
            for (int col = 0; col < iniS; col++) {
                System.out.print(" ");
            }

            // star
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            iniS = iniS + 2;
            System.out.println();
        }

        for (int row = 1; row <= n; row++) {
            //star
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            //space
            for (int col = 1; col <= (2 * n) - 2 * row; col++) {
                System.out.print(" ");
            }
            //star
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void getStarPattern(int n) {
        // Write your code here

        for(int row = 0; row <n; row++) {
            for (int col = 0; col < n; col++) {
                if (row==0 || col==0 || row == n-1 || col == n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    public static void getNumberPattern(int n) {
        // Write your code here.
        for (int row=0; row<2*n-1; row++) {
            for (int col=0; col<2*n-1;col++) {
                int top = row;
                int bottom = col;
                int right = (2*n -2 ) - col;
                int left = (2*n -2) - row;

                System.out.print(n- Math.min(Math.min(top,bottom),
                        Math.min(left,right)));
            }
            System.out.println();
        }
    }

    public static String concatenateStrings(ArrayList<String> arr)
    {
        //Your code here
        String strs = new String();
        for( String str:arr) {
             strs = strs.concat(str);
        }
        return strs;
    }

    public static <T extends Number> double add (T num1, T num2) {
        double result = num1.doubleValue() + num2.doubleValue();
        return result;
    }

    public static int countDigits(int n){
        // Write your code here.
        int count = 0;
        int no = n;
        while(n>0) {
            int lastDigit = n%10;
            if (no%lastDigit ==  0 && lastDigit !=0)
                count++;
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        //seeding1(3);
        //nStarTriangle(3);
        //nStarDiamond(3);
       // nStarTriangleone(3);
           // symmetry(3);
            //getStarPattern(4);
        //getNumberPattern(3);
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("Saurabh");
//        arr.add("Suresh");
//        arr.add("Rathi");
//
//        String concateS = concatenateStrings(arr);
//        System.out.println(concateS);
        int count = countDigits(660);
        System.out.println(count);
    }
}
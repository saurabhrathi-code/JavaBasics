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

    public static void main(String[] args) {
        //seeding1(3);
        nStarTriangle(3);
    }
}

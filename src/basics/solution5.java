package basics;

import java.util.Scanner;

public class solution5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        //precompute
        int [] hash = new int[13];
        for (int i = 0; i<n; i++) {
            hash[arr[i]] += 1;
        }

        int q;
        q = scanner.nextInt();
        while (q-- !=0) {
            int number = scanner.nextInt();

            //fetching
            System.out.println(number);
        }

    }
}

package basics;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution4 {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int first = findFirst(arr, n, k);
        int last = findLast(arr, n, k);
        return new int[]{first,last};


    }

    private static int findFirst(ArrayList<Integer> arr, int n, int target) {
        int low =0, high = n-1, first = -1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(arr.get(mid)>=target) {
                if(arr.get(mid) == target) {
                    first = mid;
                }
                high = mid-1;
            } else {
                low = mid +1;
            }
        }
        return first;
    }

    private static int findLast(ArrayList<Integer> arr, int n, int target) {
        int low = 0, high = n-1, last = -1;

        while(low<=high) {
            int mid = low + (high-low)/2;
            if (arr.get(mid) <= target) {
                if (arr.get(mid) == target) {
                    last = mid;
                }
                low = mid +1;
            } else {
                high = mid -1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(6);
        int [] arr = firstAndLastPosition(arrayList, 7, 2);
        for (int temp: arr) {
            System.out.println(temp);
        }
    }

//    private static int findFirst(ArrayList<Integer> arr, int n, int target) {
//        int
//    }
}

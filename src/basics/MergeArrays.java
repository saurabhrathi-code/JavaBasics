package basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8,5,7}; // note duplicates are 5,7

        int[] mergedArr = mergeAndSortArrays(arr1,arr2);
        System.out.println("Merged and sorted Array: " + Arrays.toString(mergedArr));
    }

    private static int[] mergeAndSortArrays(int[] arr1, int[] arr2) {

        //use set to handle uniqueness
        Set<Integer> mergedSet = new HashSet<>();

        //add elements from both arrays to the set
        for(int num:arr1) {
            mergedSet.add(num);
        }
        for(int num:arr2) {
            mergedSet.add(num);
        }

        //convert set back to array
        int[] mergedArray = mergedSet.stream().mapToInt(Integer::intValue).toArray();

        // Sort the merged array
        Arrays.sort(mergedArray);

        return  mergedArray;
    }
}

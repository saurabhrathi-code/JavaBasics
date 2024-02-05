package basics;

public class Solution7 extends Opps2 {

    public static void main(String[] args) {
        int[] arr = {11, 14, 8, 3, 12, 14, 1, 7, 4, 3 };
        countFrequency(10, 14,  arr);
    }
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int hash[] = new int[x+1];
        for(int i=0; i<n; i++) {
            if (nums[i] >= 1 && nums[i] <=x) {
                hash[nums[i]] +=1;
            }
        }
        return hash;
    }

    @Override
    int print() {
        return 0;
    }
}

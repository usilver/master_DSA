/*
* Given an array arr of size N. The task is to find the sum of the contiguous subArray within an array with the largest sum.

Input Format
First line consists of an integer n

Second line consists of n spaced integers

Output Format
Print the maximum subArray sum present in the array

Example 1
Input:
5
2 3 1 -1 0
Output:
6
* */
import java.util.*;

class Maximum_Sum_SubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();
        System.out.println(maxSubArraySum(arr));
    }
    static int maxSubArraySum(int[] a) {
        int max_sum = 0;
        int csum = 0; // current_sum

        // What is the starting and ending index of max subArray?
        int sp = 0; // staring index point
        int ep = 0; // ending index point

        // kadane's algorithm
        for(int i = 0; i < a.length; i++){
            csum  += a[i];

            // update current_sum and sp when current_sum value becomes lesser than 0.
            if(csum < 0){
                csum = 0;
                sp = i + 1;
            }

            // update max_sum and ep when max_sum becomes lesser than current sum.
            if(max_sum < csum){
                max_sum = csum;
                ep = i;
            }
        }
        System.out.println("sp: " + sp + " | ep: " + ep);
        return max_sum;
    }
}

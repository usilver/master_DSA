/*
* Given an integer array numbs and an integer k, print the number of non-empty subArrays that have a sum divisible by k.

A subArray is a contiguous part of an array.

Input Format
Input consists of two lines.

The first line contains two integers n (size of the array) and k.
The second line contains n spaced integers.

Output Format
Print count of subArrays divisible by k
*
* Brute Force | O(n^3) |
* */

import java.util.*;

class SubArray_Sum_Divisible_By_k {

    static int subArrayDivisibleByK(int[] arr, int n, int k){
        int ans = 0;
        for(int sp = 0; sp < n ; sp++){
            for(int ep = sp; ep < n; ep++){
                //subArray from sp (starting point) to ep (end point)
                // check if array from sp to ep is divisible by k
                boolean isDivisible = subArraySumDivisibleByK(arr, sp, ep, k);

                if(isDivisible){
                    ans++;
                }
            }
        }
        return ans;
    }
    static boolean subArraySumDivisibleByK(int[] arr, int sp, int ep, int k){
        int sum = 0;

        int i = sp;
        while(i <= ep){
            sum  += arr[i];
            i++;
        }
        return (sum % k == 0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        int result = subArrayDivisibleByK(arr, n, k);
        System.out.print(result);
        System.out.println('\n');
    }
}
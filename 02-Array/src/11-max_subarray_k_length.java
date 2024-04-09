import java.util.Scanner;

class Max_SubArray_K_Length {
    static int maxSubArray(int[] arr, int k){

        int max_sum = Integer.MIN_VALUE;

        for (int sp = 0; sp < arr.length - 1 - k; sp++){
            int c_sum = 0;

            for (int ep = sp; ep <= sp + k - 1; ep++){
                c_sum = c_sum + arr[ep];
            }
            
            System.out.println(c_sum);
            
            if (max_sum < c_sum){
                max_sum = c_sum;
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the size of an array: ");
        int n = sc.nextInt(); // size of array
        int[] arr = new int[n]; // array

        System.out.print("Please enter the size of a subArray: ");
        int k = sc.nextInt(); // size of subArray

        // array elements
        for(int i = 0; i < n; i++){
            System.out.print("Please enter integer " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        sc.close();
        
//        int[] arr = {1, 5, 8, 9, -4, 5, -12, 8, 20};
//        int[] arr = {-1, -5, -8, -9, -15, -1, -22, -34, -55};
//        int k = 4;

        int max_subArray = maxSubArray(arr, k);

        System.out.println(max_subArray);
    }
}

/* 
Brute Force | O(n*n) | 
*/

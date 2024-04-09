import java.util.Scanner;

class Max_Sub_Array_K_Length {
    static int maxSum(int[] arr, int k){

        int max_sum = Integer.MIN_VALUE;
        int w_sum = 0; // window sum

        for (int i = 0; i < k; i++){
            w_sum += arr[i];
            max_sum = Math.max(max_sum, w_sum);
        }

        for(int i = k; i < arr.length; i++){
            w_sum = w_sum - arr[i - k] + arr[i];
            max_sum = Math.max(w_sum, max_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the size of an array: ");
        int n = sc.nextInt();

        System.out.print("Please enter the size of a subArray: ");
        int k = sc.nextInt();

        int[] arr = new int[n];

        // array elements
        for (int i = 0; i < n; i++){
            System.out.print("Please enter integer " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        int max_sum = maxSum(arr, k);

        System.out.print(max_sum);
    }
}

/*
    Sliding Window Technique | O(n) |
 */

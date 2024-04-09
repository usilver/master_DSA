import java.util.Scanner;

class Rotate_Array {
    static void rotateArray(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        if(k < 0){
            k = k + n; // k -> (0, n - 1)
        }

        reverse(nums, 0, n-k-1); // left part reverse
        reverse(nums, n-k, n-1); // right part reverse
        reverse(nums, 0, n-1); // whole array reverse
    }

    static void reverse(int[] nums, int si, int ei){

        while(si <= ei){
            int temp = nums[si];
            nums[si] = nums[ei];
            nums[ei] = temp;
            si++;
            ei--;
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        rotateArray(arr, k);

        for(int num : arr){
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

/*
Given an array with N elements, the task is to rotate the array to the right by K steps.
Note : if K is negative , rotate the array to the left.
*/


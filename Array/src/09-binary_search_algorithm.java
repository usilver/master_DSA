import java.util.*;

class Binary_Search_Algorithm {

    static int binarySearch(int[] arr, int n,  int tar){
        int lo = 0; // lowest
        int hi = n - 1; // highest

        while (lo <= hi){
            int mid = (lo + hi)/2;

            if (arr[mid] == tar){
                return mid;
            }else if(arr[mid] < tar) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1; // if element is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter size of an array: ");
        int n = sc.nextInt(); // array size
        System.out.print("Please enter your target: ");
        int tar = sc.nextInt(); // target
        int[] arr =new int[n] ;// creating array of n size

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        int search = binarySearch(arr, n, tar);

        if (search < 0){
            System.out.print("Your target does not exist!");
        }else {
            System.out.print("Your target is found at index: " + search);
        }
    }
}

/*
Binary Search Algo | O(n) |
*/

import java.util.*;

class Reverse_Array {

    static void reverseArray(int[] arr, int start, int end)
    {
        int si = 0; // starting index
        int ei = arr.length - 1; // ending index
        while(si < ei){
            swap(arr, si, ei);  // swapping elements
            si++;
            ei--;
        }
    }

    static void swap(int[] arr, int si, int ei){
        // copying original values before swapping
        int value_at_si = arr[si];
        int value_at_ei = arr[ei];

        //swapping
        arr[si] = value_at_ei;
        arr[ei] = value_at_si;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();

        reverseArray(arr1, 0, n-1);

        // printing reversed array elements
        for (int i = 0; i < n; i++)
            System.out.print(arr1[i] + " ");
    }
}

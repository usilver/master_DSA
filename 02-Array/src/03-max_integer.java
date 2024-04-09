import java.util.Scanner;

class Max_Integer {

    // first method
    static int maxElement1st(int[] array, int n){
        int max = Integer.MIN_VALUE;  // -(2^32 - 1)

        for (int i = 0; i < n; i++){
            int ele = array[i];
            if (ele > max){
                max = ele;
            }
        }
        return max;
    }

    // Second method
    static  int maxElement2nd(int[] array, int n){
        int max = array[0];

        for (int i = 0; i < n; i++){
            int ele = array[i];
            if (ele > max){
                max = ele;
            }
        }
        return max;
    }

    // Third method: used in case if all elements are greater than or equal to 0.
    static int maxElement3rd(int[] array, int n){
        int max = 0;

        for (int i =  0; i < n; i++){
            int ele = array[i];
            if (ele > max){
                max = ele;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // array
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // max integer
        int maxElement1st = maxElement1st(arr, n);
        int maxElement2nd = maxElement2nd(arr, n);
        int maxElement3rd = maxElement3rd(arr, n);

        System.out.println(maxElement1st);
        System.out.println(maxElement2nd);
        System.out.println(maxElement3rd);
    }
}

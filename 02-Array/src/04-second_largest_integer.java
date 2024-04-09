import java.util.Scanner;

class Second_Largest_Integer {

    static int secondLargestInteger(int[] array, int n){

        int largest = Integer.MIN_VALUE;
        int secondLargestInteger = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int ele = array[i];

            if (ele > largest){
                secondLargestInteger = largest;
                largest = ele;
            }else if(ele > secondLargestInteger){
                secondLargestInteger = ele;
            }
        }
        return secondLargestInteger;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // array
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // second largest integer
        int second_LargestInteger = secondLargestInteger(arr, n);

        System.out.println(second_LargestInteger);
    }
}

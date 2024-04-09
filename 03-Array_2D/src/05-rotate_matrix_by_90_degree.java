import java.util.Scanner;

class Rotate_Matrix_By_90_Degree {

    static int[][] rotateMatrixBy90(int[][] arr, int n){

        // call transpose function to change nth row into nth column.
        transposeMatrix(arr, n);

        for(int i = 0; i < n; i++){
            int[] int_arr = arr[i];

            // reverse integer array to rotate by 90 degree.
            reverseArray(int_arr);
        }
        return arr;
    }

    static void transposeMatrix(int[][] arr, int n){

        for (int i = 0; i < n; i++){
            for (int j = i; j < arr[i].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void reverseArray(int[] int_arr){

        int start = 0;
        int end = int_arr.length - 1;
        while(start < end){
            swap(int_arr, start, end);  // swapping elements
            start++;
            end--;
        }
    }

    static void swap(int[] int_arr, int start, int end){

        // copying original values before swapping
        int value_at_start = int_arr[start];
        int value_at_end = int_arr[end];

        //swapping
        int_arr[start] = value_at_end;
        int_arr[end] = value_at_start;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the size of Integer 2D Array: ");
        int n = sc.nextInt();

        System.out.print("Please enter the size of an Integer Array: ");
        int m = sc.nextInt();

        if (m < n){
            System.out.println("Size of an Integer Array must be equal to 2D Array!");

            System.out.print("Please enter the size of an Integer Array: ");
            m = sc.nextInt();
        }

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print("Please enter integer [" + (i + 1) + "][" + (j+1) + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int[][] arr_rotated_by_90 = rotateMatrixBy90(arr, n);

        for (int[] array: arr_rotated_by_90){
            for (int ele: array){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

class Transpose_Of_Matrix {
    static int[][] transposeOfMatrix(int[][] arr, int n, int m){

        // best method
        for(int i = 0; i < n; i++){
            for (int j = i; j < arr[i].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

    static int[][] transposeMatrix(int[][] arr, int n, int m) {

        // easy method
        int[][] myArr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                myArr[i][j] = arr[j][i];
            }
        }
        return myArr;
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

        int[][] transpose_of_arr = transposeOfMatrix(arr, n, m);
//        int[][] transpose_of_arr = transposeMatrix(arr, n, m);

        for (int[] array: transpose_of_arr){
            for (int ele: array){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}

/*
Write a program to find the transpose of a square matrix of size N*N.
 Transpose of a matrix is obtained by changing rows to columns and columns to rows.

Expected Time Complexity: | O(N * N) |
We use transpose function to convert nth row into nth column.

Expected Space Complexity: In place

Input Format
The first line contains an integer N.

The next N lines contains N spaced integers each, elements of matrix.

Output Format
Print the transposed matrix.

Example 1
Input

4
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
Output

1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
Explanation

The rows and columns are switched.
Example 2
Input

5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
Output

1 6 11 16 21
2 7 12 17 22
3 8 13 18 23
4 9 14 19 24
5 10 15 20 25
Explanation

The rows and columns are switched.
For example: 6 was at position 0, 1 in original matrix.
In the transposed matrix, it is at position 1, 0.

Constraints
1 <= N <= 100

-10^3 <= mat[i][j] <= 10^3
*/
import java.util.Scanner;
class Print2DArray {
    public void printElements(int[][] arr) {

        // array element traversal
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                int ele = arr[i][j];
                System.out.print(ele + " ");
            }
            // adding a new line for next row
            System.out.println();
        }
    }
}

class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.print("Please enter length of row: ");
        n = sc.nextInt();
        System.out.print("Please enter length of column: ");
        m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }
        
        Print2DArray Obj = new Print2DArray();
        Obj.printElements(arr);
        sc.close();
    }
}

/*
Level: Easy | Time Complexity: O(n*n) |
Print 2D Array
You are given 2D Array arr of size N x M, print the elements of it.

Input Format
First line contains 2 space separated integers N and M, representing number of rows and columns respectively.

Next N lines contains M space separated integers representing elements of the array arr.

Output Format
Elements of the array in N lines, where each line has M space separated integers.

Example 1
Input

2 3
1 2 3
4 5 6
Output

1 2 3
4 5 6
Explanation

Here the input 2D array has 2 rows and 3 columns. In the first row the array has 3 elements 1, 2 and 3. In the second row, the array has 3 elements 4,5 and 6. So in the output there will be 2 lines and each line will contain 3 space separated integers. The first line will contain the elements of the first row and the second line will contain the elements of the second row.

Example 2
Input

2 1
1
2
Output

1
2
Explanation

Here, the input 2D array, has 2 rows and 1 column. In the first row the array has 1 element 1. In the second row the array has 1 element 2. So in the output there will be 2 lines and each line will contain 1 integer. The first line will contain the elements of the first row and the second line will contain the elements of the second row.

Constraints
1<=N<=10^4

1<=M<=10^4
*/

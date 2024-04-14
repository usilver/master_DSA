import java.io.IOException;
import java.util.Scanner;

class SpecialMatrix {
    static boolean special(int[][] matrix, int n){

        // Matrix Traversal | i == j --> Diagonal Elements |
        // | i + j == n - 1 --> Anti-diagonal Elements |
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j || i + j == n - 1){
                    // non-zero
                    if(matrix[i][j] == 0) return false;
                } else{
                    // zero
                    if(matrix[i][j] != 0) return false;
                }
            }
        }
        return true;
    }

    // // Time Complexity O(n)
    static boolean special2(int[][] matrix, int n){

        // Diagonal Traversal
        int row = 0;
        int col = 0;

        while (row < n && col < n){
            if (matrix[row][col] == 0){
                return  false;
            }

            row++;
            col++;
        }

        // Anti-diagonal Traversal
        row = 0;
        col = n - 1;

        while (row < n && col >= 0){
            if (matrix[row][col] != 0){
                return false;
            }
            row++;
            col--;
        }
        return true;
    }
}

class MatrixTraversal{
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number of test cases: ");
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.print("Please enter length of row and column: ");
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("[" + i + "][" + j + "] : ");
                    matrix[i][j] = sc.nextInt();
                }
            }

            SpecialMatrix ob = new SpecialMatrix();
            boolean ans = SpecialMatrix.special(matrix, n);
            boolean ans2 = SpecialMatrix.special2(matrix, n);

            System.out.println(ans);
            System.out.println(ans2);
        }
    }
}

/*
Level: Easy | Time Complexity: 1. O(n*n) 2. O(n) |

Special Matrix

A square matrix is called special matrix if all the non-diagonal elements
of the matrix are zero and the diagonal elements are non-zero.

You are given a square matrix with N rows and columns.
You have to check whether the given matrix is special or not.
If the given matrix is special, true will be printed, else false.

NOTE: You need to complete the given function. The input and
printing of output will be handled by the driver code.

Input Format:
The first line contains the number of test cases t.

For each test case: The first line contains N.

The next N lines contain N integers each representing
the elements of the matrix.

Output Format:
For each test case in t, output t lines true
if the matrix is special else false

Example 1:
Input:

1
3
1 0 2
0 2 0
3 0 1
Output:

true
Explanation:

The diagonal elements are non-zero and non-diagonal elements are zero.

Example 2:
Input:

1
3
1 0 1
1 2 0
2 0 3
Output:

false
Explanation:

The non-diagonal element in second row of first column is non-zero.

Constraints:
1 <= T <= 10

1 <= N <= 200

0 <= A[i] <=1000000
*/

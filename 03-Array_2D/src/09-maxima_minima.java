import java.util.Scanner;

class MaximaMinima {
    public static int maximaMinima(int[][] mat){

        int n = mat.length;
        int m = mat[0].length;

        // Finding min value in a row
        for(int i = 0; i < n; i++){
            int min = Integer.MAX_VALUE;
            int min_col = -1;

            for(int j = 0; j < m; j++){
                if (mat[i][j] < min){
                    min = mat[i][j];
                    min_col = j;
                }
            }

            // check whether the smallest value in a row is largest in a column or not.
            if(checkIfLargest(mat, min_col, min)){
                return min;
            }
        }
        return -1;
    }

    public static boolean checkIfLargest(int[][] mat, int min_col, int min){

        // Finding maximum value in col
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < mat.length; i++){
            if(max < mat[i][min_col]){
                max = mat[i][min_col];
            }
        }
        return max == min;
    }

    // just for fun to check at which row my answer is located while seeing output ==> ignore during revision

    public static int rowOfMaximaMinima(int[][] mat){

        int n = mat.length;
        int m = mat[0].length;
        int min_row = -1;

        // Finding min value in a row
        for(int i = 0; i < n; i++){
            int min = Integer.MAX_VALUE;
            int min_col = -1;

            for(int j = 0; j < m; j++){
                if (mat[i][j] < min){
                    min = mat[i][j];
                    min_col = j;
                    min_row = i;
                }
            }

            // check whether the smallest value in a row is largest in a column or not.
            if(checkIfLargest(mat, min_col, min, min_row)){
                return min_row;
            }
        }
        return -1;
    }
    public static boolean checkIfLargest(int[][] mat, int min_col, int min, int min_row){

        // Finding maximum value in col
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < mat.length; i++){
            if(max < mat[i][min_col]){
                max = mat[i][min_col];
            }
        }
        return max == min;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Please enter length of matrix[n][n]: ");
        n = sc.nextInt();
        if(n < 1){
            System.out.print("Enter Integer Value Greater than 0: ");
            n = sc.nextInt();
        }
        int[][] mat = new int[n][n];

        // get matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + i + "][" + j + "] : ");
                mat[i][j] = sc.nextInt();
            }
        }

        int result = maximaMinima(mat);
        int seeOutput = rowOfMaximaMinima(mat); // see at which row result is located.

        // see matrix
        for(int i = 0; i < n; i++){
            System.out.print("= ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int ele = mat[i][j];
                System.out.print(ele + " ");
                if(i == seeOutput && j == (n-1)){
                    System.out.print("          ⇦ " + result);
                }
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            System.out.print("= ");
        }
        System.out.println();
        System.out.println("Minimum in row and Maximum in column is " + result + ".\n" + "Explore more!");
        sc.close();
    }
}

/*
Level: Easy | Time Complexity: O(n*n) |

Maxima Minima

Given an n*n matrix mat find an element such that it is the smallest in a row and
largest in a column, if such an element does not exist return -1.

Input Format
First line contains the values n.

Next n lines contain n spaced integers.

Output Format
Return the element that is smallest in a row and
largest in a column if not found return -1.

Example 1
Input

2
1 3
6 5
Output

5
Explanation

Row 2 contains minimum element 5 that is largest in the 2nd column.

Example 2
Input

3
1 2 3
4 5 6
7 8 9
Output

7
Explanation

Here the minimum value is 7 in the third row and the largest value in the 1st column.

Constraints
1 <= n <= 10^3

1 <= mat[i][j] <=10^5
*/

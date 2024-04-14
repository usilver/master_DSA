import java.util.Scanner;

class AltMatrixSum {
    public static void alternateMatrixSum(int [][]mat, int n) {

        int black = 0;
        int white = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(i % 2 == 0){
                    if(j % 2 == 0){
                        black += mat[i][j];
                    }else {
                        white += mat[i][j];
                    }
                }else {
                    if(j % 2 == 0){
                        white += mat[i][j];
                    }else {
                        black += mat[i][j];
                    }
                }
            }
        }

        System.out.println(black);
        System.out.print(white);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Please enter length of row and column: ");
        n = sc.nextInt();

        int [][]mat=new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + i + "][" + j + "] : ");
                mat[i][j] = sc.nextInt();
            }
        }
        alternateMatrixSum(mat,n);
        System.out.println('\n');
    }
}

/*
Level: Easy | Time Complexity: O(n*n) |

Alt Matrix Sum

You are given a chessboard of size N x N, where the top left square is black.
Each square contains a value.
Find the sum of the values of all black squares and all white squares.

Remember that in a chessboard, black and white squares are alternate.

Input Format
The first line contains N, the size of a row of the square matrix.

The next N lines contain N space-separated integers each.

Output Format
Print two lines, the first line containing the sum of black squares and
the second line containing the sum of white squares.

Example 1
Input

3
1 2 3
4 5 6
7 8 9
Output

25
20
Explanation

Black squares contain 1, 3, 5, 7, 9: sum = 25

White squares contain 2, 4, 6, 8: sum = 20

Example 2
Input

2
3 5
7 4
Output

7
12
Explanation

Black squares contain 3, 4: sum = 7

White squares contain 5, 7: sum = 12

Constraints
1 <= N <= 1000

1 <= matrix[i][j] <= 10^5
*/

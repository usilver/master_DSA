import java.util.Scanner;

class FindTheWay {
    public static int[] findTheWay(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = 0;
        int dir = 0;

        while(row >= 0 && col >=0 && row < n && col < m){
            if(matrix[row][col] == 1){
                dir = (dir + 1) % 4; // dir change
            }

            if(dir == 0){
                col++; // right
            } else if( dir == 1){
                row++; // down
            } else if(dir == 2){
                col--; // left
            } else {
                row--; // up
            }
        }

        if(row == -1) row++;
        if(col == -1) col++;
        if(row == n) row--;
        if(col == m) col--;

        return new int[]{row, col};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("Please enter length of row: ");
        m = sc.nextInt();
        System.out.print("Please enter length of column: ");
        n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + i + "][" + j + "] : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int[] result = findTheWay(matrix);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}

/*
Level: Easy | Time Complexity: O(n) |
 
Find The Way

You are given a binary matrix of dimensions m*n. A mouse enters the matrix at cell (0,0) in left to 
right direction.

He goes in the same direction if he encounters a 0, and he takes a right turn when he encounters a 1,
 and changes that specific 1 to 0.
 Otherwise, he may get stuck in a cycle!

You have to find the co-ordinates from where this mouse will exit the matrix.

Input Format
First line contains the values m and n.

Next m lines contain n spaced integers.

Output Format
Return the co-ordinates from where this mouse will exit the matrix separated by space.

Example 1
Input

1 2
0 0
Output

0 1
Explanation

The mouse will enter at (0,0) and keep going ahead and come out of (0,1).

Example 2
Input

3 3
0 1 0
0 1 0
1 0 1
Output

1 0
Explanation

We enter the matrix at (0,0) we move to (0,1) and encounter a 1, so we change it to 0 and move right to (1,1), we again encounter 1 and turn right.

Then we leave the matrix from (1,0). Thus, the output is 1 0.

Constraints
1 <= m,n <= 100

matrix[i][j] is 0, 1
*/

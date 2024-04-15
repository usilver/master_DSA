import java.util.Scanner;

class BooleanMatrixProblem {

    public static int[][] BooleanMatrix(int m,int n,int[][] mat){

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                // finding 1
                if(mat[i][j] == 1){
                    //updating value to 1 in row
                    for(int k = 0; k < n; k++){
                        mat[i][k] = 1;
                    }
                    // leaving current row after finding 1 and updating row value to 1.
                    break;
                }
            }
        }
        return mat;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter length of row: ");
        int m = sc.nextInt();

        if (m < 1){
            System.out.print("Enter Integer Value greater than 0: ");
            sc.nextInt();
        }
        System.out.print("Please enter length of column: ");
        int n = sc.nextInt();

        if (n < 1){
            System.out.print("Enter Integer Value greater than 0: ");
            sc.nextInt();
        }

        int[][] nums =new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + i + "][" + j + "] : ");
                nums[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // Matrix Before
        for(int i = 0; i < n; i++){
            System.out.print("= ");
        }
        System.out.println();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int ele = nums[i][j];
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        int[][] ans = BooleanMatrix(m,n,nums);

        // Matrix After
        for(int i = 0; i < n; i++){
            System.out.print("= ");
        }
        System.out.println();

        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                System.out.print(ans[i][j] + " ");
            }
            System.out.print("\n");
        }

        for(int i = 0; i < n; i++){
            System.out.print("= ");
        }
        System.out.println();
    }
}

/*
Level: Easy | TC: O(n*n*n) |

Boolean Matrix Problem

You are given a matrix Mat of m rows and n columns.
The matrix is boolean so the elements of the matrix can only be either 0 or 1.

Now, if any row of the matrix contains a 1,
then you need to fill that whole row with 1. After doing the mentioned operation,
you need to return the modified matrix.

Your task is to complete the function BooleanMatrixProblem which takes m, n and
the input array as the parameter and
returns the modified matrix as specified in the question.

Input Format
The first line of contains m and n denoting number of rows and number of columns respectively.

Then next m lines contain n elements each denoting the elements of the matrix.

Output Format
Return the modified matrix as specified above.

Example 1
Input

5 4
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
Output

1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
Explanation

rows = 5 and columns = 4

The given matrix is

1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
Evidently, the first row contains a 1 so fill the whole row with 1.
The third row also contains a 1 so that row will be filled too.
Finally, the last row contains a 1, and therefore it needs to be filled with 1 too.

The final matrix is

1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1

Example 2
Input

2 2
1 0
0 1
Output

1 1
1 1

Explanation
rows = 2 and columns = 2

The given matrix is

1 0
0 1

Evidently, the first row contains a 1 so fill the whole row with 1.
The second row also contains a 1 so that row will be filled too.
The final matrix is

1 1
1 1

Constraints
1 <= m, n <= 300

Mat[i][j] ∈ {0,1}
*/

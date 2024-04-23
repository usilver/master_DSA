import java.util.ArrayList;
import java.util.Scanner;

class PascalTriangle {
    public static ArrayList<ArrayList<Integer>> pascalTriangle(int numRows) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); // {{empty}}

        ArrayList<Integer> past = new ArrayList<>(); // {empty}
        past.add(1); // {1}
        ans.add(past); // {{1}}

        // {{empty ans al}} --> we add 1 in beginning --> {{1} so now we have to add (n-1) more rows}
        int total_number_of_line = numRows - 1;

        while(total_number_of_line > 0){
            ArrayList<Integer> curr = new ArrayList<>();

            // adding elements in current AL using past AL
            for(int i = 1; i < past.size(); i++){
                int csum = past.get(i) + past.get(i-1); // current sum
                curr.add(csum);
            }

            curr.add(0, 1); // adding 1 at first position
            curr.add(1); // adding 1 at the end

//            ans.add(curr); // not recommended! it's tough to debug! Time complexity O(1)

            ArrayList<Integer> temp = new ArrayList<>(curr); // Costly but recommended! Time complexity O(n)
            ans.add(temp);

            past = curr;
            total_number_of_line--;
        }
        return ans;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows of the pascal triangle: ");
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

/*
Pascal's Triangle

Level: Easy | Time complexity O(n) or O(1) |

You are given a number n, you are required to print the first n rows of the pascal triangle.

Pascal Triangle

Your task is to complete the function pascalTriangle which receives n as the parameters and returns a 2D array containing the first n rows of the pascal's triangle.

Input Format
You are given a single integer n representing the number of rows of pascal's triangle.

Output Format
Print n lines of output, where ith line represents the ith row of the triangle.

Example 1
Input

3
Output

1
1 1
1 2 1
Example 2
Input

5
Output

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1

Constraints:
1<= n <= 30
*/

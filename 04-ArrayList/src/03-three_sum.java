import java.util.ArrayList;
import java.util.Scanner;

class ThreeSum {
    public static int threeSum(ArrayList<Integer> arr, int target) {

        int n = arr.size();
        int ans = 0;
        for(int i = 0; i < n; i++){

            // skip same elements
            if(i-1 >= 0 && arr.get(i-1) == arr.get(i)){
                continue;
            }

            // adding first element for sure and creating a new target
            int curr_ele = arr.get(i);
            int new_tar = target - curr_ele;

            // two sum pairs
            int twoSumPairs = twoSumBetweenIndices(arr, new_tar, i+1, n-1);
            ans += twoSumPairs;
        }
        return ans;
    }

    public static int twoSumBetweenIndices(ArrayList<Integer> arr, int target, int left, int right){

        int number_of_pairs = 0;

        while(left < right){
            int csum = arr.get(left) + arr.get(right);

            if(csum > target){
                right--;
            }else if(csum < target){
                left++;
            }else {
                number_of_pairs++;
                int curr_ele = arr.get(right);
                right--;
                while(left < right && arr.get(right) == curr_ele){
                    right--;
                }
            }
        }
        return number_of_pairs;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, target;
        System.out.print("Size of an ArrayList: ");
        n = sc.nextInt();  // size of arraylist

        ArrayList<Integer> arr = new ArrayList<Integer>(n);

        // adding elements to arr ArrayList
        for (int i = 0; i < n; i++){
            System.out.print("Element " + (i+1) + ": ");
            arr.add(sc.nextInt());
        }

        System.out.println("Enter Your Target: ");
        target = sc.nextInt(); // target
        sc.close();

        // three sum
        int result = threeSum(arr, target);
        System.out.println(result);

    }

}

/*
Triplet Sum to X

Level: Medium | Time Complexity: O(n*n)

You have been given a non-decreasing integer ArrayList(arr) and a number X. Find and return the number of distinct triplets in the ArrayList which sum to X.

Note

Given ArrayList is sorted and can contain duplicate elements.

Input format
The first line contains an Integer t which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer N representing the size of the first ArrayList.

The second line contains N single space-separated integers representing the elements in the ArrayList.

The third line contains an integer X.

Output format
For each test case, print the total number of distinct triplets present in the array/list.

Output for every test case will be printed in a separate line.

Example 1
Input

1
7
1 2 3 4 5 6 7
12
Output

5
Explanation

Triplets are (1,4,7), (1,5,6), (2,3,7), (2,4,6), (3,4,5).

Example 2
Input

1
7
1 2 3 4 5 6 7
19
Output

0
Explanation

Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.

Constraints
1 <= t <= 50

1 <= N <= 10^3

-10^6 <= arr[i] <= 10^6

-10^9 <= X <= 10^9
*/


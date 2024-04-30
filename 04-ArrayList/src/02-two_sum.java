import java.util.ArrayList;

class TwoSum {
    public static ArrayList<ArrayList<Integer>> twoSum(int[] arr, int target){

        // It's like 2D integer array: 2D Integer ArrayList
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int left = 0;
        int right = arr.length - 1;
        int countPairs = 0;

        while (left < right){
            ArrayList<Integer> curr = new ArrayList<>();
            int csum = arr[left] + arr[right]; // current sum

            if (csum > target) {
                right--;
            } else if (csum < target) {
                left++;
            } else {
                // when csum == target
                curr.add(arr[left]);
                curr.add(arr[right]);

                // creating a temporary arraylist to copy curr arraylist
                ArrayList<Integer> temp = new ArrayList<>(curr);

                // adding temp arraylist into 2D ans arraylist
                ans.add(temp);

                // counting pairs
                countPairs++;

                // don't add repeated elements
                int curr_ele = arr[right];
                right--;  // or left++;

                while (left < right &&  arr[right] == curr_ele){
                    right--;
                }

                // when you shift your left pointer instead of right pointer

//                int curr_ele = arr[left];
//                left++;

//                while (left < right &&  arr[left] == curr_ele){
//                    left++;
//                }
            }
        }

        System.out.println("Total number of pairs whose sum equals to target is: " + countPairs);

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 5, 10,13, 13, 14, 14, 15, 17};
        int target = 15;

        ArrayList<ArrayList<Integer>> element_pairs_sum_equal_to_target = twoSum(arr, target);

        for (int i = 0; i < element_pairs_sum_equal_to_target.size(); i++) {
            for (int j = 0; j < element_pairs_sum_equal_to_target.get(i).size(); j++) {
                int pair = element_pairs_sum_equal_to_target.get(i).get(j);
                System.out.print(pair + " ");
            }
            System.out.println();
        }
    }
}

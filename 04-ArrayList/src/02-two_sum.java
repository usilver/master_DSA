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

        int[] arr = {1, 2, 5, 10, 13, 14, 15, 17};

        // printing arr
        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                System.out.print("[");
            }

            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            }else {
                System.out.print(arr[i]);
            }

            if (i == arr.length - 1){
                System.out.print("]");
            }
        }
        System.out.println();

        int target = 15;

        ArrayList<ArrayList<Integer>> twoSumPairs = twoSum(arr, target);

        // printing twoSumPairs
        for (int i = 0; i < twoSumPairs.size(); i++) {
            if (i != 0) {
                System.out.print("[");
            } else {
                System.out.print("[[");
            }

            for (int j = 0; j < twoSumPairs.get(i).size(); j++) {
                int pair = twoSumPairs.get(i).get(j);
                if (j != (twoSumPairs.get(i).size() - 1)) {
                    System.out.print(pair + ", ");
                }else {
                    System.out.print(pair);
                }
            }

            if (i != twoSumPairs.size() - 1) {
                System.out.print("], ");
            } else {
                System.out.print("]]");
            }
        }
    }
}

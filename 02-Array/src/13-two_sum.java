class TwoSum {
    public static int twoSum(int[] arr, int target){

        int left = 0;  // left pointer
        int right = arr.length - 1; // right pointer
        int countPair = 0;

        while (left < right){

            int csum = arr[left] + arr[right]; // current sum

            if (csum > target) {
                right--;
            } else if (csum < target) {
                left++;
            } else {

                // csum == target
                countPair++;

                // don't count repeated elements
                int curr_ele = arr[right];
                right--;
                // or shift left pointer towards right: left++
                // and if you do so do this: curr_ele = arr[left];

                while (left < right &&  arr[right] == curr_ele){
                    right--;
                }
            }
        }

        return countPair;
    }

    public static void main(String[] args) {

//        int[] arr = {1, 2, 5, 10, 13, 14, 15, 17};
//        int[] arr = {1, 1, 2, 2, 5, 10,13, 13, 14, 14, 15, 17};
        int[] arr = {1, 2, 2, 5, 5, 10, 10, 12, 12, 13, 13, 14, 14, 20};
        int target = 15;

        int total_number_of_pairs_sum_equal_to_target = twoSum(arr, target);
        System.out.println(total_number_of_pairs_sum_equal_to_target);
    }
}

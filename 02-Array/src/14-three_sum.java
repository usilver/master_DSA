class ThreeSum {
    public static int threeSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++){

            // skip if next element is same
            if (i - 1 >= 0 && arr[i - 1] == arr[i]) {
                continue;
            }

            // adding first element for sure and creating a new target
            int first_ele = arr[i];
            int target_left = target - first_ele;

//            ans += twoSumBetweenIndices(arr, target - arr[i], i + 1, n - 1);
            int twoSumPairs = twoSumBetweenIndices(arr, target_left, i+1, n - 1);
            ans += twoSumPairs;
        }
        return ans;
    }
    public static int twoSumBetweenIndices(int[] arr, int target, int left, int right){

        int number_of_pairs = 0;

        while (left < right){

            int csum = arr[left] + arr[right]; // current sum

            if (csum > target) {
                right--;
            } else if (csum < target) {
                left++;
            } else {
                number_of_pairs++;

                // don't count repeated elements
                int curr_ele = arr[right];
                right--;  // or left++;

                while (left < right &&  arr[right] == curr_ele){
                    right--;
                }
            }
        }
        return number_of_pairs;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 3, 4, 4, 7, 8, 8, 12, 14, 15, 15, 17, 17, 19};
        int target = 26;

        // three sum
        int three_sum_pairs = threeSum(arr, target);
        System.out.println(three_sum_pairs);
    }
}
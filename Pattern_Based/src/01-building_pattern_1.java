import java.util.Scanner;

class Building_Pattern1 {
    public static void main(String[] args) {
//        int[] arr = {9, 3, 7, 6, 2, 0, 4};
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
            if (arr[i] < 0){
                System.out.print("Please enter valid number: ");
                arr[i] = scn.nextInt();
            }
        }
        buildingPattern(arr);
    }
    public static void buildingPattern(int[] arr){
        int max = maxElement(arr);

        // vertical loop/height of the building
        for (int i = max; i > 0; i--){

            // horizontal loop/width of the building
            for (int ele : arr) {
                if (i <= ele) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }
        }
        return max;
    }
}


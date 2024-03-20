import java.util.Scanner;

class I_Love_You {
    public static void main(String[] args) {
        // love you code😂
//        int[] love =
//        {7, 0, 0, 7, 1, 1, 1, 1, 0, 0, 7, 1, 1, 1, 7, 0, 0, 1, 1, -1, -1, 1, 1, 0, 0, 4, 3, 2, 1, 2, 3, 4};

        // find your love code
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] love = new int[n];
        for (int i = 0; i < n; i++) {
            love[i] = scn.nextInt();
        }
        scn.close();
        propose(love);
    }

    public static void propose(int[] arr) {
        int max = maxElement(arr);
        int min = minElement(arr);

        // when integers are positive print above x-axis
        for (int i = max; i > 0; i--) {
            for (int ele : arr) {
                if (i <= ele) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // when integers are negative print below x-axis
        for (int k = min; k < 0; k++) {
            for (int ele : arr) {
                if (k >= ele) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }
        }
        return max;
    }

    public static int minElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int ele : arr) {
            if (ele < min) {
                min = ele;
            }
        }
        return min;
    }
}

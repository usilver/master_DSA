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
        int current_number_of_line = max;
        int current_line_below_zero = min;

        // when integers are positive print above x-axis
        while (current_number_of_line > 0) {
            for (int pos = 0; pos < arr.length; pos++) {
                int pos_height = arr[pos];
                if (current_number_of_line <= pos_height) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // prepare for next line
            System.out.println();
            current_number_of_line--;
        }

        // when integers are negative print below x-axis
        while (current_line_below_zero < 0) {
            for (int pos = 0; pos < arr.length; pos++) {
                int pos_height = arr[pos];
                if (current_line_below_zero >= pos_height) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            current_line_below_zero++;
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

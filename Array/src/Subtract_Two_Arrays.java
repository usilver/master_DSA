import java.util.Scanner;

public class Subtract_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) a1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) a2[i] = sc.nextInt();
        sc.close();

        int[] res = subtract(a1, a2);
        for (int i : res) System.out.println(i);
    }
    public static int[] subtract(int[] a1, int[] a2) {
        // swap arrays (swapping allowed. a1 - a2 || a2 - a1 same result)
        if (a1.length < a2.length) {
            int[] temp = a1;
            a1 = a2;
            a2 = temp;
        }
        int n = a1.length;
        int m = a2.length;
        int[] res = new int[n];
        int i = n - 1;
        int j = m - 1;
        int k = res.length - 1;
        int borrow = 0;

        while (k >= 0){
            if (borrow == 1){
                if (a1[i] != 0){
                    a1[i]--; // 77 - 8 = ([7-1] - 0) (17 - 8) = 69
                }else {
                    a1[i] = 9;  // 101 - 6 = (0) (9) (11-6=5) = 95
                }
                borrow = 0;
            }
            if (a1[i] < 0){
                a1[i] += 10;
                borrow = 1;
            }
            if(j<0){
                res[k] = a1[i];
            } else if(a1[i] >= a2[j]){
                res[k] = a1[i] - a2[j];
            } else {
                res[k] = (a1[i] + 10) - a2[j];
                borrow = 1;
            }
            i--;
            j--;
            k--;
        }
        return res;
    }
}
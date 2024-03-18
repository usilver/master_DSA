import java.util.Scanner;

class Add_Two_Arrays{

    // Adding array1 & array 2
    static int[] calSum(int[] a1, int[] a2, int n, int m)
    {

        // new array size
        int res_size = Math.max(n, m) + 1;

        // new array
        int[] res = new int[res_size];

        int i = n - 1;
        int j = m - 1;
        int k = res_size - 1;
        int carry = 0;

        while (k > 0){

            int current_sum = 0;
            if (i >= 0){
                current_sum += a1[i];
            }

            if (j >= 0){
                current_sum += a2[j];
            }

            current_sum += carry;
            if (current_sum > 9){
                carry = 1;
                current_sum = current_sum % 10;
            }else {
                carry = 0;
            }

            res[k] = current_sum;

            i--;
            j--;
            k--;
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array 1
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }

        // array 2
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }

        sc.close(); // closing input

        // adding array1 & array2
        int[] res = calSum(arr1, arr2, n1, n2);

        // printing resultant array

        int i = 0;
        if (res[0] == 0){
            i++;
        }

        for (; i < res.length; i++){
            System.out.println(res[i]);
        }

        // another way to print in above style
        /* if(res[0] == 0){
            for(int i = 1; i < res.length; i++){
                System.out.println(res[i]);
            }
        }else {
            for (int i = 0; i < res.length; i++){
                System.out.println(res[i]);
            }
        } */

        // print array horizontally
        /* for (int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        } */

    }
}


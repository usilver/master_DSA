import java.util.*;

class Building_Pattern_2 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        buildings(arr, n);
    }

    static void buildings(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for(int ele: arr){
            if(ele > max){
                max = ele;
            }
        }

        int current_number_of_line = max;

        while(current_number_of_line > 0){
            for(int pos=0; pos<n; pos++){
                int pos_height = arr[pos];

                if(current_number_of_line <= pos_height){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
            current_number_of_line--;
        }
    }
}

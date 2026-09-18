package Assignment_3;

import java.util.Scanner;

public class Max_Sum_Path_In_Two_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            int[] brr = new int[m];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < brr.length; i++)

            {
                brr[i] = sc.nextInt();
            }
            System.out.println(sum(arr,brr));
        }
        
    }
    public static int sum(int[] arr, int[] brr) {
    int i = 0;
    int j = 0;
    int p = 0;
    int q = 0;
    int ans = 0;

    while (i < arr.length && j < brr.length) {
        if (arr[i] < brr[j]) {
            i++;
        } else if (arr[i] > brr[j]) {
            j++;
        } else {
            int sum1 = 0;
            int sum2 = 0;

            for (int k = p; k <= i; k++) {
                sum1 += arr[k];
            }

            for (int k = q; k <= j; k++) {
                sum2 += brr[k];
            }

            ans += Math.max(sum1, sum2);

            i++;
            j++;
            p = i;
            q = j;
        }
    }

    while (i < arr.length) {
        ans += arr[i];
        i++;
    }

    while (j < brr.length) {
        ans += brr[j];
        j++;
    }

    return ans;
}
}
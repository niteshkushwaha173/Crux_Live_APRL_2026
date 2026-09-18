package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Triplet {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

        int[] arr =new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int T = sc.nextInt();

        findTriplets(arr, T);
    }

    public static void findTriplets(int[] arr, int T) {

        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while(left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if(sum == T) {
                    System.out.println(
                        arr[i] + " " +
                        arr[left] + " " +
                        arr[right]
                    );

                    left++;
                    right--;
                }
                else if(sum < T) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
    }
}
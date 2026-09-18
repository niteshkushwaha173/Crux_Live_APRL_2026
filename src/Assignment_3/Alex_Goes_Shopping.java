package Assignment_3;

import java.util.Scanner;

public class Alex_Goes_Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < price.length; i++) {
            price[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            int A = sc.nextInt();// Alex ka paise
            int k = sc.nextInt();// Item


            if(isitpossible(price, A, k)==true){//if function is true then function is call
               
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }

    public static boolean isitpossible(int[] price, int A, int k) {
        int count = 0;
        for (int i = 0; i < price.length; i++) {
            if (A % price[i] == 0) {
                count++;
            }
        }
        if (count >= k) {//kam se kam k choice hona chahiye 
            return true;
        }else{
            return false;
        }
    }
}

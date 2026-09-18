package Assignment_2;

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int sum=0;
            int rem=n%10;
            if(n%2==0)
            {
                sum=sum+rem;
            }
            System.out.println(sum);
        }
    }
}
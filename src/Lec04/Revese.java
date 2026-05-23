package Lec04;

import java.util.Scanner;

public class Revese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		System.out.println(sum);
	}
}

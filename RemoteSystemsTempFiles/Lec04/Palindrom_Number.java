package Lec04;

import java.util.Scanner;

public class Palindrom_Number {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(temp==sum)
		{
			
			System.out.println(sum+" "+"Number is palindrom");
		}else {
			System.out.println(sum+" "+"Number is not a palindron");
		}
	}

}

package Lec07_Function;

import java.util.Scanner;

public class IS_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(is_Armstrong_Number(n));
		
	}
	public static boolean is_Armstrong_Number(int n)
	{
		int cod=count_of_Digit(n);//4
		int sum=0;
		int p=n;
		while(n>0)
		{
			int rem=n%10;
			sum=(int)(sum+Math.pow(rem, cod));//Math.pow by default double 
			n=n/10;
		}
		if(sum==p)
		{
			return true;
		}else 
		{
			return false;
		}
	}
	public static int count_of_Digit(int n) 
	{
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		return count;
	}

}

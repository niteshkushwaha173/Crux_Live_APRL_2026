package Assignment_2;

import java.util.Scanner;

public class Boston_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Is_Boston(n));
	}
	
	public static int Is_Boston(int n){
		int Sum_Of_n=Sum_Of_Digit(n);
		int i=2;
		int sum=0;
		while(n>0)
		{
			if(n%i==0)
			{
				sum+=Sum_Of_Digit(i);
				n=n/10;
			}
			else {
				i++;
			}
		}
		if(Sum_Of_n==sum) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public static int Sum_Of_Digit(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
}

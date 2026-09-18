package Lec04;

import java.util.Scanner;

public class Fibbonacci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		int n=sc.nextInt();
		for(int i=0;i<=n;i=i+1) 
		{
			System.out.println(a);

			int c=a+b;
			a=b;
			b=c;
	}
		System.out.println(a);

	}

}

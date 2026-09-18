package Lec06;

import java.util.Scanner;

public class Byte_Conversion {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//byte b=(byte)400;
		byte b=(byte)300;
		//System.out.println();
		short s=5;
		int i=6;
		long l=9565_567_675l;//change of type of litral
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		//System.out.println();
		i=sc.nextInt();
		l=sc.nextLong();
		s=sc.nextShort();
		b=sc.nextByte();
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
	}
}

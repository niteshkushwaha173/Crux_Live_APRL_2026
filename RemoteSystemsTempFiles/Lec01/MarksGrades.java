package Lec01;

import java.util.Scanner;
public class MarksGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("Entr the number ");
 int n=sc.nextInt();
 if(n>=75)
 {
	 System.out.print(n+" Grade is A");
 }
 else if(n>=65 && n<=75)
 {
	 System.out.println(n+" Grade is B");
 }	
 else if(n>=55 && n<=65) {
	 System.out.println(n+" Grade is c");
 }
 else if(n>=45 && n<=55)
 {
	 System.out.println(n+" Grade is D");
 }
 else
 {
	 System.out.println("Fail");
 }
	}

}

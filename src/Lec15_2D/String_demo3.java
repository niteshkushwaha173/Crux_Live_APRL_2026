package Lec15_2D;

import java.util.Scanner;

public class String_demo3 {
    public static void main(String[] args) {
        System.out.println("Hello"+10+30+"Bye");
        //o/p:- Hello1030Bye
        System.out.println("Hello"+(10+20)+"Bye");
        //O|P:-Hello30Bye =>String+Integer=String
         System.out.println(10+30+"Bye");
         //Integer+String=Integer 
        String str="Nitesh";
         System.out.println(str.length());
         System.out.println(str.charAt(1));

         Scanner sc=new Scanner(System.in);
         String s=sc.next();
        // String s=sc.nextLine();
        System.out.println("Enter string here");
        System.out.println(s);

    }
}

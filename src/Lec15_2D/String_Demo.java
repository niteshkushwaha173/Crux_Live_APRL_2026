package Lec15_2D;

public class String_Demo {
    public static void main(String[] args) {
        String s1 = "Hello";// String constant pool
        String s2 = "Hello";// Duplicate not allow
        String s3 = new String("Hello");
        String s4 = new String("Hello");// String constant pool ke bahar
        System.out.println(s1);
        System.out.println(s2);//content print kr rha hai 
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s1==s3);//false Address compare
        System.out.println(s1==s2);//true 
        System.out.println(s1.equals(s3));//Content compare 
        int []arr=new int[5];
        System.out.println(arr.length);//arr--> Variable length
        System.out.println(s1.length());//length method 
       
    }
}

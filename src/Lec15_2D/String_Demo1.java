package Lec15_2D;

public class String_Demo1 {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=new String("Hello");
        s1=s1+"bye"; //String pool se bahar ake object bnta hai 
                    //Pool se bahar Heap ke Andar 

        String s4="Hello"+"Bye";//Pool me banega iske alava sab pool ke bahar banega
        String s5="Hello"+"Bye"; 
        System.out.println(s4==s5); 
    }
    
}

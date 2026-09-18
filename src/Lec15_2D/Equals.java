package Lec15_2D;

public class Equals {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        System.out.println(equals(s1,s2));
    }
    public static boolean equals(String s1,String s2){
        //Address nhi milne ye nhi chalega 
        if(s1==s2){
            return true;
        }
        //compare length same na nhi to nhi chaega
        if(s1.length()!=s2.length()){
            return false;
        }
        //O(n)
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}

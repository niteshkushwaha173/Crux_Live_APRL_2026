package Lec16;

public class String_to_Number {
    public static void main(String[] args) {
        String s="4565678";
        int num=Integer.parseInt(s);
        System.out.println(num);
        long l=Long.parseLong(s);
        System.out.println("converted in long => "+l);
    }
}

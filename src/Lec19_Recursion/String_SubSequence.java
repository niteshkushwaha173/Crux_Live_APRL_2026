package Lec19_Recursion;

public class String_SubSequence {
    public static void main(String[] args) {
        String quest="abc";
        Print(quest,"");
    }
    public static void Print(String quest,String ans) {
        if(quest.length()==0)
        {
            System.out.print(ans+" ,");
            return;
        }
        char ch=quest.charAt(0);
        Print(quest.substring(1),ans);
        Print(quest.substring(1),ans+ch);
    }
}

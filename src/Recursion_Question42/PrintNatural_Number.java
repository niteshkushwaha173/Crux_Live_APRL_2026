package Recursion_Question42;

public class PrintNatural_Number {
    public static void main(String[] args) {
        int n=5;
        Print(n);
    }
    public static void Print(int n)
    {
        if(n==0)
            {
                //System.out.println(ans);
                return ;
            }
            Print(n-1);
            System.out.print(n);
        }
}

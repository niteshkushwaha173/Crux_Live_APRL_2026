package Recursion_Question42;

public class InvertNaturalNumber {
    public static void main(String[] arr)
    {
int n=5;
Print(n);
    }
    public static void Print(int n)
    {
        if(n==0)
            {
                return;
            }
            System.out.print(n+" ");
            Print(n-1);
    }
}

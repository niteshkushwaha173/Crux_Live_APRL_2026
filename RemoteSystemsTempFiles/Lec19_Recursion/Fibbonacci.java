package Lec19_Recursion;

public class Fibbonacci {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(Fibb(n));
    }

    public static int Fibb(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f1 = Fibb(n - 1);
        int f2 = Fibb(n - 2);
        return f1 + f2;

    }
}

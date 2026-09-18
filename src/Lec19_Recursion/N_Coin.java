package Lec19_Recursion;

public class N_Coin {
    public static void main(String[] args) {
        int n = 3;
        Toss(n, "");
    }

    public static void Toss(int n, String ans) {
        if (n == 0) {
            System.out.println(ans + " ");
            return;
        }
        Toss(n - 1, ans + "H");
        Toss(n - 1, ans + "T");
    }

}

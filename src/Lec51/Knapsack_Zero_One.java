package Lec51;

public class Knapsack_Zero_One {
    public static void main(String[] args) {
        int[] wt = { 1, 2, 3, 2, 2 };
        int[] value = { 8, 4, 0, 5, 3 };
        int cap = 4;
        System.out.println(Knapsack(wt, value, cap, cap));
    }
    public static int Knapsack(int []wt,int []val,int cap,int i)
    {
        if(cap==0 || i==wt.length){
            return 0;
        }
        int inc=0,exc=0;
        if(cap>=wt[i]){
            inc=val[i]+Knapsack(wt, val, cap, inc);
        }
        exc=Knapsack(wt, val,cap,i+1);
        return Math.max(inc,exc);
    }
}

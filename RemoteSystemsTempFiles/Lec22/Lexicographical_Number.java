package Lec22;

import java.util.ArrayList;
import java.util.List;

public class Lexicographical_Number {
    public static void main(String[] args) {
        int n=1000;
        List<Integer> ll=new ArrayList<>();
        Lexicographical(n, 0);
    }
    public static void Lexicographical(int n,int curr,List<Integer> ll)
    {
        if(curr>n)
            {
                return;
            }
            System.out.println(curr);
        
        int i=0;
        //For 10 call
        if(curr==0)
        {
            i=1;
        }
        //for 9 call
        for(;i<=9;i++)
            {
Lexicographical(n, curr*10+i,ll);
            }
    }
}

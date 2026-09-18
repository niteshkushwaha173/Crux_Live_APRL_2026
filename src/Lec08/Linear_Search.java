package Lec08;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
       // System.out.println(Search(arr, n));
       System.out.println(Search(arr, n));
    }
    public static int Search(int[] arr,int item)
    {
        //Traverse Each Array
        for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==item)
                {
                    return i;
                }
                // else{
                //     return ;
                // }
            }
            return -1;//JAB Array me item mile hi nhi 
                     // tab -1 ko return kr dete hai 
    }
}

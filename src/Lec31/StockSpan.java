package Lec31;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int arr[]={30,35,40,38,35};
    }
    public static void cal_sapan(int [] arr)
    {
         Stack<Integer> st=new Stack<>();
        int [] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++)
            {
while(!st.isEmpty() && arr[i]>arr[st.peek()])
    {
        ans[st.pop()]=arr[i];
    }
    st.push(i);
            }
            while(!st.isEmpty())
                {
                    ans[st.pop()]=-1;
                }
                for(int i=0;i<ans.length;i++)
                {
                    System.out.print(arr[i]+" "+ans[i]);
                }

    }
}

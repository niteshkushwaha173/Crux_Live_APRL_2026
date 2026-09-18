package Lec31;

import java.util.Stack;

public class Largest_Rectangle_In_Histogram {
    public static void main(String[] args) {
        
    }
    public static int Largest_Rectangle(int [] arr)
    {
        Stack<Integer> st=new Stack<>();
        int area=0;
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]<arr[st.peek()])
            {
                int r=i;
                int h=arr.[st.pop()];
                if(st.isEmpty())
                    {
                        area=Math.max(area, h*r);
                    }
                    else
                        
                        {
                            int l=st.peek();
                            area=Math.max(area, h*(r-l-1));
                        }
            }
        }
    }
}

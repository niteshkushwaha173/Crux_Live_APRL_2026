package Lec10;

public class Min_From_ith_Index {
    public static void main(String[] args) {
        int []arr={4,-1,5,3,2,1,7};
        System.out.println(Min_From_ith_Index(arr, 2));
    }
    public static int Min_From_ith_Index(int []arr,int idx)
    {
        int minI=idx;
        for(int i=idx;i<arr.length;i++)
            {
                if(arr[i]>arr[minI])
                {
                    minI=i;
                }
            }
            return minI;
    }
}

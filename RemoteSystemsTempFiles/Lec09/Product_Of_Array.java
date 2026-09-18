package Lec09;

public class Product_Of_Array {
    public static void main(String[] args) {
        int []arr={2,3,4,5};
        int []a= Product(arr);
        for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+" ");
            }
    }
    public static int[] Product(int[] arr)
    {
        //Prefix
        int n=arr.length;
        int []left=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++)
            {
                left[i]=left[i-1]*arr[i-1];
            }
            //suffix
            int []right=new int[n];
            right[n-1]=1;
            for(int i=n-2;i>=0;i--)
            {
                right[i]=right[i+1]*arr[i+1];
            }
            //Answer Calculation
           // int sum=0;
            for(int i=0;i<arr.length;i++)
            {

                left[i]=left[i]*right[i];
            }
            return left;
    }
    
}

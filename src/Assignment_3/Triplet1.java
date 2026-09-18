package Assignment_3;

import java.util.Arrays;

public class Triplet1 {
    public static void main(String[] args) {
        int []arr={5, 7 ,9 ,1, 2, 4 ,6, 8 ,3};
        int target=10;
        for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            Triplet1(arr, target);
    }
    public static void Triplet1(int [] arr,int target)
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    for(int k=j+1;k<arr.length;k++)
                    {
                        int sum=arr[i]+arr[j]+arr[k];
                        if(sum==target)
                        {
                              System.out.println(
                        arr[i] + " " +
                        arr[j] + " " +
                        arr[k]
                    );
                        }
                    }
                }
            }
    }
}

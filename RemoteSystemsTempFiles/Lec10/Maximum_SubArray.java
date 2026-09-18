package Lec10;

public class Maximum_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {5,3,-9,11,-2,7};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(SubArray(arr));
	}
	public static int SubArray(int []arr)
	{
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;//Update each iteration from new side 
			for(int j=i;j<arr.length;j++)
			{
				sum+=arr[j];
				ans=Math.max(ans, sum);
				if(sum<0)
				{
					sum=0;
				}
			}
		}
		return ans;
	}
}

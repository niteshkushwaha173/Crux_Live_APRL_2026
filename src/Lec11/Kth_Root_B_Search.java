package Lec11;

public class Kth_Root_B_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,3,5,8,9,11,13,15,16,18,19};
		int n=149;
		int k=3;
		System.out.println(root(n,k));
	}
	public static int root(int []arr,int n,int k)
	{
		int lo=arr.length;
		int hi=arr.length-1;
		while(lo<=hi)
		{
			int mid=(lo<=hi)/2;
			if(Math.pow(mid, k)==n)
			{
				
			}
			else
			{
				hi=mid-1;
			}
			
		}
	}
}

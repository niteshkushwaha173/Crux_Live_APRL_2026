package Lec10;

public class Kadens_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(Kaden(arr));
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}*/
	}
public static int Kaden(int []arr) 
{
     int sum=0;
     int ans=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++)
     {
    	 sum+=arr[i];
    	 ans=Math.max(ans, sum);
    	 if(sum<0)
    	 {
    		 sum=0;
    	 }
     }
     return ans;
}
}

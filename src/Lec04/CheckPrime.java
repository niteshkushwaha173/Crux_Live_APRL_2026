package Lec04;

public class CheckPrime {
	public static void main(String [] args)
	{
		int n=5;
		int c=0;
		for(int i=2;i<n;i++) 
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c>=1) 
		{
			System.out.println("Not prime");
		}else
		{
			System.out.println("Prime");
		}
	}
}

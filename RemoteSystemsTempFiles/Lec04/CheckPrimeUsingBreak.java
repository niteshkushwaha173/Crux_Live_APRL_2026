package Lec04;

public class CheckPrimeUsingBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int c=0;
		for(int i=2;i<n;i++) 
		{
			if(n%i==0)
			{
				c++;
				break;//Forcefully loop ko rokna 
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

package Lec04;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int n=7;
		for(int i=1;i<=n;i=i+1) 
		{
			//System.out.println(a);

			int c=a+b;
			a=b;
			b=c;
	}
		System.out.print(a);

	}

}

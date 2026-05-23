package Lec06;

public class Count_of_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123456;
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
	}

}

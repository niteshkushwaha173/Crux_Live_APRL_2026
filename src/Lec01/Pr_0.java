package Lec01;

public class Pr_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=n;
		while(row<=n)
		{
			//Star
			int i=1;
			while(i<=n)
			{
				System.out.print("* ");
				i++;
			}
			//next line ka prep
			row++;
			System.out.println();
		}
		
	}

}

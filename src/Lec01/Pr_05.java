package Lec01;

public class Pr_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=n;
		int space=0;
		while(row<=n)
		{
			//space
			int i=1;
			while(i<=space)
			{
				System.out.print("  ");
				i++;
			}
			//Star
			int j=1;
			while(j<=star)
			{
				System.out.print("* ");
				j++;
			}
			//next line ka prep 
			System.out.println();
			row++;
			star--;
			space+=2;
			
		}
	}

}

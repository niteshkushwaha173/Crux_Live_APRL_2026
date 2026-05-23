package Lec01;

public class Pr_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=1;
		int space=n-1;
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
			star++;
			space--;
			
		}
	}

}

package Lec03;

public class Pr_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int space=n-1;
		int star=1;
		
		while(row<=n) 
		{
			//Space
			int i=1;
			while(i<=space) 
			{
				System.out.print("  ");
				i++;
			}
			//Star

			int j=1;
			int val=1;
			while(j<=star) 
			{
				System.out.print(val+" ");
				val++;
				j++;
			}
			//nextLine Ka Prep
			System.out.println();
			row++;
			star+=2;
			space--;
		}
		
		
	}

}

package Lec03;

public class Pr_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row =1;
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
			int j = 1;
			int val=1;//Main change
			while (j <= star) {
				System.out.print(val+" ");
				if(j<star/2+1)
				{
					val++;
				}
				else{
					val--;
				}
				j++;
			}

			//next line 
			System.out.println();
			row++;
			space--;
			star+=2;
			
		}
	}

}

package Lec01;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int row =1;
		int space=0;
		int star=n;
		while(row<=n)
		{
			int i=1;
			while(space>=i)
				{
					System.out.print("- ");
					i++;
				}
                //Star
                int j=1;
			while(star>=j)
				{
					System.out.print("* ");
					j++;
				}
					System.out.println();
				row++;
				space++;
				star--;
		}

		}

	}
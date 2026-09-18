package Lec03;

public class Pr_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=1;
		while(row<=2*n-1)
		{
			//star
			int i=1;
			
			while(i<=star)
			{
				System.out.print("* ");
				i++;
			}
			//mirror
			if(row<n) {//mirror se pahle 
				star++;
			}
			else
			{
				star--;
			}
			//nextline ka prep
			System.out.println();
			row++;
		}
	}

}

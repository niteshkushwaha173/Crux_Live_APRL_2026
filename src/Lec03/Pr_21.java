package Lec03;

public class Pr_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;
		int space = 2 * n - 3;
		while (row <= n) {
			// Star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;

			}

			// Space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

			// Star
			int k = 1;
			if(row==n) //Handle the last line extra star
			{
				k=2;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}

			// next line ka prep
			System.out.println();
			row++;
			space -= 2;
			star++;
		}

	}
}

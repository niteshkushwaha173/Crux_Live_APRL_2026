package Lec01;

public class Pattern2 {

	public static void main(String[] args) {
	
		int n = 5;
		int row = 1;
		int star = n;
		while (row <= n) {
			// star
			int i = 1;
			while (i <= row) {
				System.out.print("* ");
				i++;
			}
			// next Line Prep
			System.out.println();
			row++;

		}

	}

}
package Lec01;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = n;
		int star = 1;
		while (row>=1) {
			// star
			int i = 1;
			while (i <= row) {
				System.out.print("* ");
				i++;
			}
			// next Line Prep
			System.out.println();
			row--;

		}

	}

}
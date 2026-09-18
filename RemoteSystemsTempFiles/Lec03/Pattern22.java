package Lec03;

import java.util.Scanner;

public class Pattern22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		int space = - 1;
		while (row <= n) {

			// Star
			int i = 1;
			while (i <= star) {
				System.out.print("*");
				i++;
			}
			// Space
			int j = 1;
			while (j <= space) {
				System.out.print(" ");
				j++;
			}
			
			
			// Star
			int k = 1;
			if(row==1)
			{
				k=2;
			}
			while (k <= star) {
				System.out.print("*");
				k++;
			
		}

		// Next Line Prep
		System.out.println();
		row++;
		star--;
		space +=2;
		}
	}
}

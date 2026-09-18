package Lec15_2D;

public class Spiral_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 4, 7, 11, 15 }, 
		           { 2, 5, 8, 12, 19 }, 
		           { 3, 6, 9, 16, 22 }, 
		           { 10, 13, 14, 17, 24 },
		           { 18, 21, 23, 26, 30 }
	};
		public static void Spiral(int [][]arr) 
		{
			for(int i=min_c;i<=max_c;i++)
			{
				System.out.println(matrix[min_r][i]);
			}
			min_r++;
			for(int i=min_r;i<=max_r;i++)
			{
				
			}
		}
	}
}

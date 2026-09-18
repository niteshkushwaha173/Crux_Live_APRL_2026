package Lec14;

public class Staire_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]matrix= {{},{},{},{}};
		int target=5;
	}
	public static boolean Search(int [][]matrix,int target)
	{
		int row=0;
		int col=matrix[0].length-1;
		while(row<matrix.length&& col>=0) {
		if(matrix[row][col]==target)
		{
			return true;
		}
		else if(matrix[row][col]>target)
		{
			col--;
		}
		else {
			row++;
		}
		}
		return false;
	}
}

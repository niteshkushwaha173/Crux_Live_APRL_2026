package Lec10;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {4,5,3,2,1};
		B_Sort(arr);
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void B_Sort(int []arr)
	{
		for(int term=1;term<arr.length;term++)
		{
			for(int i=0;i<arr.length-term;i++)
			{
				if(arr[i]>arr[i+1])
				{
					//swap
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}

}

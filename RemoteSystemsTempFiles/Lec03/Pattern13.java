package Lec03;

public class Pattern13 {

	public static void main(String[] s) 
	{
		int n=5;
		
		int row=1;
		int star=1;
		int space=n-1;
		while(row<=2*n-1) 
		{
			//Space
			int i=1;
			while(i<=space){
			System.out.print("  ");
			i++;
			}
			//Star
			int j=1;
			while(j<=star)
				{
					System.out.print("* ");
					j++;
				}
				//Mirror
	    if(row<n)
		{
         star++;
		 space--;
		}
		else{
			star--;
			space++;
		}
		//Next line 
		System.out.println();
		row++;

		
	    	
	}
	}
}

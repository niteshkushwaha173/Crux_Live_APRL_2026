package Lec04;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=0;
        int star=1;
        //Star
        
        while(row<n)
        {
        	//Star
        	int i=0;
        	int ncr=1;
        	while(i<star)
        	{
        		System.out.print(ncr + "\t");
        		
        		ncr=(ncr*(row-i)/(i+1));//imp
        		i++;
        	}
        	//Next Line
        	System.out.println();
        	row++;
        	star++;
        }
        
	}

}

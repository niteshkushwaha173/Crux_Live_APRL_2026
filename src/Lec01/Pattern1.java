package Lec01;
public class Pattern1
{
  public static void main(String[] args) {
    
   int n=5;
   int row=1;
   int col=n;
   while(row<=n)
    {
       System.out.print("* ");
       
    int i=1;
    while(i<=col)
        {
            System.out.print("* ");
            i++;
        }
        System.out.println();
         row++;   
    } 
  }   
}
package Lec03;

public class Pattern17 {
    public static void main(String[] args) {
        int n=6;
        int Row=1;
        int star=n/2;
        int space=1;
        while(Row<=n)
        {
            int i=1;
            while(star>=i)
                {
                    System.out.print("*");
                    i++;
                }
                int j=1;
            while(space>=j)
                {
                    System.out.print(" ");
                    j++;
                }
                int k=1;
            while(star>=k)
                {
                    System.out.print("*");
                    k++;
                }
                if(Row<n/2+1)
                {
                    star--;
                    space+=2;
                }
                else{
                    star++;
                    space-=2;
                }
                System.out.println();
                Row++;
        }
    }
}

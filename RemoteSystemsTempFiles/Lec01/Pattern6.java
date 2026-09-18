package Lec01;

public class Pattern6 {
    public static void main(String[] args) {
        
        int n=5;
        int row =1;
        int star=n;
        int space=2;
        while(row<=n)
            {
                int i=1;
                while(space>=i)
                    {
                        System.out.print("  ");
                        i++;
                    }
                    int j=1;
                while(star>=j)
                    {
                        System.out.print("* " );
                        j++;
                    }
                    System.out.println();
                    row++;
                    star--;
                    space +=2;
            }
    }
}

package Lec22;

public class Towwer_Of_Hannoi {
   public static void main(String[] args) {
   int n=3;
    TOH(n, "A","B","C");
   } 
   public static void TOH(int n,String src,String hlp,String des) {
    
    if(n==0)
        {
            return;
        }
    //n-1 disk utha aur B=help pr jayega 
    //
    TOH(n-1, src, des, hlp);
    System.out.println("Move"+n+"th disk from "+src+" --> "+des);
    TOH(n-1, hlp, src, des);
   }
}

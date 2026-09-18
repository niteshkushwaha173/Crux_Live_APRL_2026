package Lec17_Assign_Qtn;

import java.util.Scanner;

public class Help_Ramu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0)
        {
            int t1=sc.nextInt();
            int t2=sc.nextInt();
            int t3=sc.nextInt();
            int t4=sc.nextInt();

           // n mtlb rickwhaw;
           //m mtlb cab
           int n=sc.nextInt();
           int m=sc.nextInt();
            int rick[]=new int[n];
              int cab[]=new int[m];
           for(int i=0;i<rick.length;i++)
           {
            rick[i]=sc.nextInt();
           }
           for(int i=0;i<cab.length;i++)
            {
                cab[i]=sc.nextInt();
            }
            int mcr=0;
            int mcc=0;
            //mcr=min cost of rickshaw

            //mcc=min cost of cab;
            for(int i=0;i<rick.length;i++)
                {
                    // int sum=rick[i]*t1;
                    // int temp=t2;
                    mcr+=Math.min(rick[i]*t1, t2);

                }
                mcr=Math.min(mcr,t3);

                //for cab
                for(int i=0;i<cab.length;i++)
                    {
                        mcc+=Math.min(cab[i]*t1,t2);
                    }
                    mcc=Math.min(t3,mcc);

                    int total=mcr+mcc;
                    System.out.println(Math.min(total,t4));
        }
    }
}

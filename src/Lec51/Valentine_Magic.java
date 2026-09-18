package Lec51;

import java.util.Arrays;

public class Valentine_Magic {
    public static void main(String[] args) {
        int []boys={2,11,3};
        int []girls={5,7,3,1};
        Arrays.sort(boys);
        Arrays.sort(girls);
    }
    public  static int Mini_Deff(int []boys,int []girls,int i,int j)
    {
        if(i==boys.length){
            return 0;
        }
        if(j==girls.length){
            return 8989079;
        }
        int pair =Math.abs(boys[i]-girls[j]+Mini_Deff(boys, girls, i, j));
        
    }
}

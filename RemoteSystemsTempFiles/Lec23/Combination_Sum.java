package Lec23;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
    public static void main(String[] args) {
        int []coin={2,3,6,7};
        int target=7;
        
        
       List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
       Combination(coin, target, ll,0,ans);
       //List<List<Integer>> ans=new ArrayList<>();
    }
    public static void Combination(int [] coin,int amount,List<Integer> ll, int idx,List<List<Integer>> ans){
        if(amount==0)
            
            {
                //System.out.println(ll);
                ans.add(new ArrayList<>(ll));
                return;
            }
        for(int i=idx;i<coin.length;i++)
            {
                if(amount>=coin[i])
                    {
                    ll.add(coin[i]);
                        Combination(coin,amount-coin[i],ll,  i,ans);
                        //amount+=coin[i]
                        ll.remove(ll.size()-1);
                    }
            }
    }
}

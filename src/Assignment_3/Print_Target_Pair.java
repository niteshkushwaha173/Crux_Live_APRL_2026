package Assignment_3;

import java.util.Arrays;

public class Print_Target_Pair {
    public static void main(String[] args) {
        int []arr={1,3,4,2,5};
        int target=5;
        Print_Pair(arr, target);
    }
    public static void Print_Pair(int []arr,int target)
    {
        Arrays.sort(arr);
            int left =0;
            int right = arr.length - 1;

            while(left < right) {

                int sum =arr[left] + arr[right];
                if(sum==target){
                System.out.println(arr[left]+" and "+arr[right]);
                    
                 left++;
                 right--;
            }
              else if(sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
            }
    }

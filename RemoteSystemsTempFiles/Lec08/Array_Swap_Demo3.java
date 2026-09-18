package Lec08;

public class Array_Swap_Demo3 {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        int []other={100,200,300,400,9};
        System.out.println(arr[0]+" "+other[0]);
        Swap(arr,other);
        System.out.println(arr[0]+" "+other[0]);
    }
    public static void Swap(int []arr,int []other) {
        int []temp=arr;
        arr=other;
        other=temp;
    }
}
//No swapping ,using ref valriable 
//Java always call by value hota hai 
//reference ko hm method me pass krte hai 
 

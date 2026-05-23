package Lec01;

public class Increament_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=5;
System.err.println(x++);
System.out.println(x);
System.out.println(x--);
System.out.println(x);
//int y=x++ - ++x + --x - x++ - --x;
int y=  x++ + --x + x++ + --x - ++x;//14
System.out.println(y);
	}

}

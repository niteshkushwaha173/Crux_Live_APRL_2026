package Lec25;

public class Sieve_Of_Eratosthenes {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(CountPrime(n));
    }

    public static int CountPrime(int n) {
        int[] prime = new int[n];
        prime[0] = 1;// 0 is not a prime number
        prime[1] = 1;// Also not a
        for (int i = 2; i * i <= prime.length; i++) {
            if (prime[i] == 0) {
                for (int j = 2; i * j < prime.length; j++) {
                    prime[i * j] = 1;
                }
            }
        }
        int c=0;
        for(int i=2;i<prime.length;i++)
        {
            if(prime[i]==0)
            {
                c++;
            }
        }
        return c;
    }

}

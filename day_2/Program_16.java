import java.util.*;
import java.io.*;
import java.lang.*;

class Program_16
{
    public static int isprime(int n)
    {
        int prime=1;
        for (int i=2; i<=Math.sqrt(n); ++i ){
            if(n%i==0){
                prime=0;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args)
    {
        for (int i=10; i<=99; ++i)
        {
            if(isprime(i)==1) {
                System.out.println(i);
            }
        }
    }
}
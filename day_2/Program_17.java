import java.util.*;
import java.io.*;
import java.lang.*;

class Program_17
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]), sum=0;
        while(n>0){
            sum+=(n%10);
            n = n/10;
        }
        System.out.println(sum);
    }
}
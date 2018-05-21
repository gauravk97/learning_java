import java.util.*;
import java.io.*;
import java.lang.*;

class Program_15
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int prime=1;
        for (int i=2; i<=Math.sqrt(n); ++i ){
            if(n%i==0){
                prime=0;
            }
        }
        String out_ = (prime==1)?"Prime":"Not Prime";
        System.out.println(out_);
    }
}
import java.util.*;
import java.io.*;
import java.lang.*;

class Program_18
{
    public static void main(String[] args)
    {
        String output="";
        int n = Integer.parseInt(args[0]);
        for (int i=1; i<=n; ++i){
            output="";
            for(int j=1; j<=i; ++j){
                output+="*";
            }
            System.out.println(output);
        }
    }
}
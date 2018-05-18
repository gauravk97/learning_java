/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Program_2
{
    public static void main (String[] args) throws IOException
    {
        
        System.out.println("Enter 2 numbers:");
        int N, M;
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        if(N>M){
          System.out.println(N);
        }
        else{
          System.out.println(M);
        }
    }
}
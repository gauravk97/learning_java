/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Program_3
{
    public static void main (String[] args) throws IOException
    {
        
        System.out.println("Enter a number:");
        int N;
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        N = Integer.parseInt(br.readLine());
        if(N%2==0){
          System.out.println("even");
        }
        else{
          System.out.println("odd");
        }
    }
}
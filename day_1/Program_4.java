/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static void main (String[] args) throws IOException
    {
        
        System.out.println("Enter 2 numbers:");
        int N, M, O;
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        O = M+N;
        if(O%2==0){
          System.out.println("even");
        }
        else{
          System.out.println("odd");
        }
    }
}
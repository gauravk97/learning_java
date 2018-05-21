/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Program_5
{
    public static void main (String[] args) throws IOException
    {
        
        int N = Integer.parseInt(args[0]);

        if(N%2==0){
          System.out.println("even");
        }
        else{
          System.out.println("odd");
        }
    }
}
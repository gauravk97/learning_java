/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static void main (String[] args) throws IOException
    {
        Integer N = Integer.parseInt(args[0]);
        if(N>0){
          System.out.println("Greater than zero");
        }
        else if(N<0){
          System.out.println("Lesser than zero");
        }
        else{
          System.out.println("Equal to zero");
        
        }
    }
}
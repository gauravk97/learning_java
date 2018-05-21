/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Program_7
{
    public static void main (String[] args) throws IOException
    {
        
        char c = args[0].charAt(0), d = args[1].charAt(0);
        int c_ = (int)c, d_ = (int)d;

        if(c_<d_){
          System.out.println(c+","+d);
        }
        else{
          System.out.println(d+","+c);
        }
    }
}
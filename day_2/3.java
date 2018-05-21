/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    
    public static void main (String[] args) throws IOException
    {
      InputStreamReader inp = new InputStreamReader(System.in);
      BufferedReader bf = new BufferedReader(inp);
      String n = bf.readLine(), output;
      String[] ar = n.trim().split("\\s+");
      int[] ar_ = new int[2];
      ar_[0] = Integer.parseInt(ar[0]);
      ar_[1] = Integer.parseInt(ar[1]);
      int sum = ar_[0] + ar_[1];
      output = "The sum of "+ar_[0]+" and "+ar_[1]+" is "+sum;
      System.out.println(output);
    }
}
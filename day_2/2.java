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
      String str = bf.readLine(), output;
      // String[] ar = str.trim().split("\\s+");
      output = "Welcome "+str;
      System.out.println(output);
    }
}
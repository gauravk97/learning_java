/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static int last_digit(int n){
      if(n<0) n*=-1;
      return (n%10);
    }
    public static void main (String[] args) throws IOException
    {
      InputStreamReader inp = new InputStreamReader(System.in);
      BufferedReader bf = new BufferedReader(inp);
      int n, m, output;
      n = Integer.parseInt(bf.readLine());
      m = Integer.parseInt(bf.readLine());
      output = last_digit(n)+last_digit(m);
      System.out.println(output);
    }
}
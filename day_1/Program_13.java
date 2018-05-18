/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static int function(int n){
      if(n<0) n*=-1;
      
      if(n<10){
        return -1;
      }
      else{
        return (n%100)/10;
      }
    }
    public static void main (String[] args) throws IOException
    {
      InputStreamReader inp = new InputStreamReader(System.in);
      BufferedReader bf = new BufferedReader(inp);
      int n = Integer.parseInt(bf.readLine()), output;
      output = function(n);
      System.out.println(output);
    }
}
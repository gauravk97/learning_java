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
      int n = Integer.parseInt(bf.readLine());
      if(n%2!=0){
        System.out.println(2);
      }
      else{
        System.out.println(1);
      }
    }
}
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{   public static int _add(int a, int b) {
 
       return (a+b);
 
    }

    public static void main (String[] args) throws java.lang.Exception
    {   
        Addition addobj = new Addition();
        int i=10;
        System.out.println(i);
        
        int j = _add(100, i);
        System.out.println(j);
    }
}

class Addition
{
    public int add(int a, int b) {
 
       return (a+b);
 
    }
}
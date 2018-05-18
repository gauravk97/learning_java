/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{   

    public static void main (String[] args) throws java.lang.Exception
    {   
        int array[] = new int[10];
        for(int i=0; i<array.length; ++i){
            array[i] = i;
        }
        for(int i=0; i<array.length; ++i){
            if(array[i]>5){
                System.out.println("bigger than five");
                // break;
                continue;
            }
            System.out.println(array[i]);
        }
    }
}
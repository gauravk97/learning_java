/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{   

    public static void main (String[] args) throws java.lang.Exception
    {
        for(int i=0; i<10; ++i){
            find:
            for(int j=0; j<10; ++j){
                for(int k=0; k<10 ;++k){
                    if(i*j*k>100){
                        break find;
                    }
                    System.out.println(i*j*k);
                }
            }
        }
    }
}
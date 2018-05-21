/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Program_6
{
    public static void main (String[] args) throws IOException
    {
        if (args.length == 0) {
            System.out.print("No Values");
        }
        else {
            for (String val:args) {
                System.out.print(val);

                if (val != args[args.length-1]) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
    }
}
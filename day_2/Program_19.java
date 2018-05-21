import java.util.*;
import java.io.*;
import java.lang.*;

class Program_19
{
    public static void main(String[] args)
    {
        String input = args[0], output="";
        for (int i=input.length()-1; i>=0; --i){
            output+=input.charAt(i);
        }
        System.out.println(output);    
    }
}
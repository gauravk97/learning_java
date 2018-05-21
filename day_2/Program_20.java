import java.util.*;
import java.io.*;
import java.lang.*;

class Program_20
{
    public static void main(String[] args)
    {
        String input = args[0], output="", result="";
        for (int i=input.length()-1; i>=0; --i){
            output+=input.charAt(i);
        }
        if(input.equals(output)) 
        {
            result = " is a palindrome";
        }
        else
        {
            result = " is not a palindrome";
        }
        System.out.println(input+" , "+output+result);   
    }
}
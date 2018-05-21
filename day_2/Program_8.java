
import java.util.*;
import java.lang.*;
import java.io.*;

class Program_8 
{
    public static void main(String[] args)
    {
        int c = (int)args[0].charAt(0);
        String result;
        if((64<c && c<91) || (96<c && c<122)) {
            result = "Alphabet";
        }
        else if (47<c && c<58) {
            result = "Digit";
        }
        else {
            result = "Special Character";
        }
        System.out.println(result);
    }
}
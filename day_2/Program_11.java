import java.util.*;
import java.io.*;
import java.lang.*;

class Program_11
{
    public static void main(String[] args)
    {
        char c = args[0].charAt(0);
        String colour="";
        switch(c){
            case 'R':
                colour="Red";
                break;
            case 'Y':
                colour="Yellow";
                break;
            case 'B':
                colour="Blue";
                break;
            case 'G':
                colour="Green";
                break;
            case 'O':
                colour="Orange";
                break;
            case 'W':
                colour="White";
                break;
            default:
                colour="Invalid";

        }
        System.out.println(colour);
    }
}
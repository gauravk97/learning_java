import java.util.*;
import java.io.*;
import java.lang.*;

class Program_10
{
    public static void main(String[] args) {
        char c = args[0].charAt(0);
        int c_;
        if((int)'A' <= (int)c && (int)c <= (int)'Z'){
            c_ = (int)c + (int)'a'-(int)'A';
        }
        else {
            c_ = (int)c + (int)'A'-(int)'a';
        }
        char f = (char)c_;
        System.out.println(c+"->"+f);
    }
}
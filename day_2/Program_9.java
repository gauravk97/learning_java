import java.util.*;
import java.io.*;
import java.lang.*;

class Program_9
{
    public static void main(String[] args)
    {
        String gender = args[0].toLowerCase();
        int age = Integer.parseInt(args[1]);
        double interest=0;

        if(gender == "female" && age <= 58) {
            interest = 8.2;
        }
        else if(gender == "female" && age > 58) {
            interest = 7.6;
        }
        else if(gender == "male" && age <= 60) {
            interest = 9.2;
        }
        else if(gender == "male" && age > 60) {
            interest = 8.3;
        }
        System.out.println(interest);
    }
}
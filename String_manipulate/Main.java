import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length = A.length() + B.length();
        String result = (A.substring(0, 1).toUpperCase() + A.substring(1)) + " " + (B.substring(0, 1).toUpperCase() + B.substring(1)); 
        System.out.println(length);
        int i = A.compareTo(B);      
        if (i>0)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(result);  
        }
    }
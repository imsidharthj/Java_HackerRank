import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Main {
    static int B;
    static int H;
    static boolean flag;

    static{
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        if (B <= 0 || H <= 0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            flag = true;
        }
    }


    public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }
            
        }

    }

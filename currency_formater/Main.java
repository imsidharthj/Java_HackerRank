import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat us_doller = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india_rupee = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chine_yuan = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franch_euro = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String us = us_doller.format(payment);
        String india = india_rupee.format(payment);
        String china = chine_yuan.format(payment);
        String france = franch_euro.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
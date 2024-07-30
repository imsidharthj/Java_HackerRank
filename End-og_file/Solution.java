import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        // scanner.nextLine(); // Consume the newline character after the integer input
        
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(n + " " + line);
            n++;
        }
        
        scanner.close();
    }
}

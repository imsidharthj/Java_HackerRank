import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        List<String> straight_A = Arrays.asList(A.split(""));
        List<String> reverse_A = new ArrayList<>();
        /* Enter your code here. Print output to STDOUT. */
        for (int i = straight_A.size() - 1; i >= 0; i--) {
            String currentChar = straight_A.get(i);
            // Check if the character is an alphabet (ignoring case)
            if (currentChar.matches("[a-zA-Z]")) {
                reverse_A.add(currentChar);
            }
        }
        String joinedString = String.join("", reverse_A);
        // Print reverse_A to check the result
        // System.out.println(joinedString);
        if (A.equals(joinedString)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
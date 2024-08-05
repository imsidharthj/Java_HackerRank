import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = x / y;
            System.out.println(z);
        }
        catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
    }
}
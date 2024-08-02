import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        BigInteger a_ = new BigInteger(a);
        BigInteger b_ = new BigInteger(b);
        BigInteger a_plus_b = a_.add(b_);
        BigInteger a_multi_b = a_.multiply(b_);
        System.out.printf("%s\n%s\n", a_plus_b, a_multi_b);
        scanner.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
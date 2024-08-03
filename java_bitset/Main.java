import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        
        for (int i = 0; i < M; i++){
            String operation = scanner.next();
            int index_b1 = scanner.nextInt();
            int index_b2 = scanner.nextInt();
            
            
            switch (operation) {
                case "AND":
                    if (index_b1 == 1) {
                        B1.and(B2);
                    } else {
                        B2.and(B1);
                    }
                    break;
                case "OR":
                    if (index_b1 == 1) {
                        B1.or(B2);
                    } else {
                        B2.or(B1);
                    }
                    break;
                case "XOR":
                    if (index_b1 == 1) {
                        B1.xor(B2);
                    } else {
                        B2.xor(B1);
                    }
                    break;
                case "FLIP":
                    if (index_b1 == 1) {
                        B1.flip(index_b2);
                    } else {
                        B2.flip(index_b2);
                    }
                    break;
                case "SET":
                    if (index_b1 == 1) {
                        B1.set(index_b2);
                    } else {
                        B2.set(index_b2);
                    }
                    break;
            }
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
        scanner.close();
    }
}
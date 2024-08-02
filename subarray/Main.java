import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer [] A = new Integer[n];
        for (int i= 0; i<n; i++){
            A[i] = scanner.nextInt();
        }
        scanner.close();
        int negative_sum = 0;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int current_sum = 0;
                for (int k = start; k <= end; k++) {
                    current_sum += A[k];
                }
                if (current_sum < 0) {
                    negative_sum++;
                }
            }
        }
        System.out.println(negative_sum);
    }
}
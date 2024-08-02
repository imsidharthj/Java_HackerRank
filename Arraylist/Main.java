import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            int d = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++){
                line.add(scanner.nextInt());
            }
            arr.add(line);
        }
        int q = scanner.nextInt();
        for(int i = 0; i < q; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try {
                System.out.println(arr.get(x-1).get(y-1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}
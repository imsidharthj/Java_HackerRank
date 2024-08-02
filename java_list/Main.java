import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> L = new ArrayList<>();
        for (int i =0; i < N; i++){
            L.add(scanner.nextInt());
        }
        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++){
            String command = scanner.next();
            int x = scanner.nextInt();
            if (command.equals("Insert")){
                int y = scanner.nextInt();
                L.add(x, y);
            }
            else if (command.equals("Delete")){
                L.remove(x);
            }
        }
        for (int i : L){
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
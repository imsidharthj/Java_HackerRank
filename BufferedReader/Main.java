import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args) throws IOException{
        System.out.println("Enter name: ");
        InputStreamReader veriable1 = new InputStreamReader(System.in);
        BufferedReader veriable2 = new BufferedReader(veriable1);
        String name = veriable2.readLine();
        System.out.println(name);
    }
}
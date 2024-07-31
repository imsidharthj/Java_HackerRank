import java.io.*;
import java.util.*;


public class Main {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> substrings = new ArrayList<>();
        for (int i=0; i<=s.length()-k; i++){
            String substring = s.substring(i, i + k);
            substrings.add(substring);
        }
        Collections.sort(substrings);
        smallest = substrings.get(0);
        largest = substrings.get(substrings.size()-1);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
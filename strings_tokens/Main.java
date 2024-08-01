import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        // String regex = "[A-Za-z !,?._'@]+";
        // Pattern pattern = Pattern.compile(regex);
        // Matcher matcher = pattern.matcher(s);
        String[] split_Strings = s.split("[^a-zA-Z]+");
        if (s.length()==0){
            System.out.println(0);
        }    
        else {
            System.out.println(split_Strings.length);
        }
        for (String str : split_Strings) {
                System.out.println(str);
    }
        scan.close();
}
}
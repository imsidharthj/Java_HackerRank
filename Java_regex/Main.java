import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex{
    String regex = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";//0|1)\\d{2}|
    public String pattern = regex + "." + regex + "." + regex + "." + regex;
}
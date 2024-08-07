import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main{
	public static void main(String[] args){
		String regex = "<(.+)>([^<]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			Matcher m = pattern.matcher(line);
          	//Write your code here
            boolean b = false;
            while (m.find()) {
                System.out.println(m.group(2));
                b = true;
            }
            if(!b){
                System.out.println("None");
            }
			
			testCases--;
		}
	}
}
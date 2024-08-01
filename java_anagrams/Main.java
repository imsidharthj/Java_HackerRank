import java.util.Scanner;

public class Main {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        int [] char_Frequencies = new int[26]; // this integer array will store
        // frequency of every alphbet appreaing in string a-z
        // char_Frequencies = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        
        for (int i=0; i<a.length(); i++){
            char current_char1 = a.charAt(i);//current_char1 obtain currect alphabet
            int index1 = current_char1-'a';
            //In Java, characters are essentially represented by their numerical ASCII values
            // (ASCII value of current_char1)-(ASCII value of 'a') = position of alphabet-1(because array start from 0)
            // increments the value at index 7 in char_Frequencies from 0 to 1.
            char_Frequencies[index1]++;
            // increments the value at index 7 in the char_Frequencies array
        }
        for (int i=0; i<b.length(); i++){
            char current_char2 = b.charAt(i);
            int index2 = current_char2-'a';
            char_Frequencies[index2]--;
        }
        for (int i=0; i<26; i++){
            if (char_Frequencies[i] != 0) return false;
        }
        return true;
    }


  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
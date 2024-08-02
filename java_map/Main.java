import java.util.*;
import java.io.*;

class Main{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        HashMap<String, Integer> phonebook = new HashMap<>();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            phonebook.put(name, phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            Integer phone = phonebook.get(s);
            if (phone != null) {
                System.out.println(s + "=" + phone);
            } else {
                System.out.println("Not found");
            }
		}
	}
}
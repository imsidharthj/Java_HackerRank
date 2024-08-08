import java.util.*;
import java.util.Stack;
class Main{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                }
                else if (stack.isEmpty()){
                    isBalanced = false;
                }
                else{
                    char top = stack.pop();                 
                    if ((top=='(' && c!=')') || (top=='{' && c!='}') || (top=='[' && c!=']')){
                        isBalanced = false;
                    }
                }
            }
            if (!stack.isEmpty()){
                isBalanced = false;
            }
            System.out.println(isBalanced);
		}
        sc.close();
		
	}
}
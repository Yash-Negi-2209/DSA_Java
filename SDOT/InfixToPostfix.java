import java.util.*;
public class InfixToPostfix {

	public static int prec(char ch) {
		if (ch == '^')
			return 3;
		else if (ch == '/' || ch == '*')
			return 2;
		else if (ch == '+' || ch == '-')
			return 1;
		else
			return -1;
	}

	
	public static void Convert(String s) {
		StringBuilder result = new StringBuilder();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
				result.append(c);
			}
		
			else if (c == '(') {
				stack.push(c);
			}
			
			else if (c == ')') {
				while (stack.peek() != '(') {
					result.append(stack.pop());
				}
				stack.pop();      //to pop '('
			}

			else {
				while (!stack.isEmpty() && (prec(s.charAt(i)) < prec(stack.peek()) || prec(s.charAt(i)) == prec(stack.peek()))){
					result.append(stack.pop());
				}
				stack.push(c);
			}
		}
		while (!stack.isEmpty()) {
			result.append(stack.pop());
		}
		System.out.println(result);
	}
  
  
	@SuppressWarnings("resource")
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Convert(str);
	}
}

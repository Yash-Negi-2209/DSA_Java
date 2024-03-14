import java.util.*;

class BasicCalculator {
  
  public static int Calculator(String str) {
    Stack<Integer> stack = new Stack<>();
    int number = 0;
    int result = 0;
    int sign = 1;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (Character.isDigit(ch)) {
        number = (number * 10) + (ch - '0');
      }
      else if (ch == '+') {
        result += number * sign;
        number = 0;
        sign = 1;
      }
      else if (ch == '-') {
        result += number * sign;
        number = 0;
        sign = -1;
      }
      else if (ch == '(') {
        stack.push(result);
        stack.push(sign);
        number = 0;
        result = 0;
        sign = 1;
      }
      else if (ch == ')') {
        result += number * sign;
        number = 0;
        int prevSign = stack.pop();
        int prevResult = stack.pop();
        result = prevResult + (result * prevSign);
      }
    }
    result += number * sign;
    return result;
  }
          
  @SuppressWarnings("resource")
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int result = Calculator(str);
    System.out.println(result);
  }
}
 
    


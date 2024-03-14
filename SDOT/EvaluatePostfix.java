import java.util.*;
class Main
{
  
  public static int evaluate(String str){
    Stack<Integer> stack = new Stack<>();
    for (int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      if (Character.isDigit(ch)){
        stack.push(ch-'0');
      }
      else{
        int val2 = stack.pop();
        int val1 = stack.pop();
        
        switch (ch){
          case '+':
            stack.push(val1+val2);
            break;
          case '-':
            stack.push(val1-val2);
            break;
          case '*':
            stack.push(val1*val2);
            break;
          case '/':
            stack.push(val1/val2);
            break;
        }
      }
    }
    return stack.pop();
  }
  
  
  @SuppressWarnings("resource")
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int testcases = sc.nextInt();
    sc.nextLine();
    while (testcases > 0){
      testcases--;
      String str = sc.nextLine();
      int result = evaluate(str);
      System.out.println(result);
    }
  }
}
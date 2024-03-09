import java.util.*;
class CountValidParanthesis{

    public static int check(String str){
        Stack<Integer> stack = new Stack<>();
        int maxlength = 0;
        int start = -1;
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch=='('){
                stack.push(i);
            }
            else{
                if (stack.isEmpty()){
                    start = i;
                }
                stack.pop();
                if (stack.isEmpty()){
                    maxlength = Math.max(maxlength, i-start);
                }
                else{
                    maxlength = Math.max(maxlength, i-stack.peek());
                }
            }
        }
        return maxlength;
    }

    @SuppressWarnings({"resource" })
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = check(str);
        System.out.println(result);
    }
}
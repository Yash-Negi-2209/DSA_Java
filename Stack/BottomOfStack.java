import java.util.*;
class BottomOfStack{

    public static void pushAtBottom(int data, Stack <Integer> st){

        // isEmpty is predefined.

        if (st.isEmpty()){
            st.push(data);
            return;
        }
        
        int top = st.pop();
        pushAtBottom(data, st);
        st.push(top);
    }



    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        pushAtBottom(5, st);


        // Print the stack:

        while (!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
        
    }
}

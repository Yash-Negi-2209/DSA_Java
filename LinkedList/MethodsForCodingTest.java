import java.util.*;

public class MethodsForCodingTest {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();

            list.addFirst("This");
            list.addLast("is");
            list.addLast("a");
            list.addLast("List");
            System.out.println(list);

            
            System.out.println(list.size());

            for (int i=0; i<list.size(); i++){
                System.out.print(list.get(i)+" -> ");
            }
            System.out.println("null");

            list.removeFirst();
            System.out.println(list);

            list.removeLast();
            System.out.println(list);

            System.out.println(list.remove(0));
        }
}

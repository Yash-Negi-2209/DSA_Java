class ReverseLL{

    private int size = 0;
    node head = null;

    class node{
        String data;
        node next;

        node (String data){
            this.data = data;
            this.next = null;
        }
    }


    // Add at first

    public void Addfirst(String data){
        node newnode = new node(data);  
        if (head == null){
            head = newnode;
            return; 
        }
        newnode.next = head;
        head = newnode;
        size++;
    }

    // Add at last

    public void AddLast( String data){
        node newnode = new node(data); 
        if (head == null){
            head = newnode;
            return; 
        } 
        node currnode = head;
        while ( currnode.next != null){
            currnode = currnode.next;
        }
        currnode.next = newnode;
        size++;
    }


    // Delete at first
    public void DeleteFirst(){
        if (head == null || head.next == null){
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
        size--;
    }


    // Delete at last
    public void DeleteLast(){
        if (head ==null || head.next == null){
            System.out.println("The list is empty");
            size--;
            return;
        }
        node secondlast = head;
        node last = head.next;
        while (last.next != null){
            secondlast = secondlast.next;
            last = last.next;
        }
        secondlast.next = null;
    }

    public void printsize(){
        System.out.println(size);
        return;
    }

    // Print the list

    public void printlist(){

         if (head ==null){
            System.out.print("List is Empty.");
            return;
        }

         node currnode = head;
        while ( currnode != null){
            System.out.print(currnode.data+" -> ");
            currnode = currnode.next;
        }
        System.out.println("Null");   
    }
    

    // To reverse the list:
    public void reversal(){
        if (head==null||head.next==null){
            return;
        }
        node prev = head;
        node curr = head.next;
        while (curr != null){
            node next = curr.next;
            curr.next = prev;

            // Update now:
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    } 


    // To reverse the list using recursion:
    public node reverseRecursion(node head){
        if(head==null || head.next==null){
            return head;
        }

        node newhead = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;

        return newhead;
    }
    

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.Addfirst("is");
        list.Addfirst("name");
        list.Addfirst("My");
        list.AddLast("Yash");
        list.printlist();

        list.reversal();
        list.printlist();
        
        list.head = list.reverseRecursion(list.head);
        list.printlist();
    }
}


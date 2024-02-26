class AddDelete{

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
    


    public static void main(String[] args) {
        AddDelete list = new AddDelete();
        list.Addfirst("is");
        list.Addfirst("name");
        list.printlist();

        list.Addfirst("My");
        list.AddLast("Yash");
        list.printlist();

        list.DeleteFirst();
        list.printlist();

        list.DeleteLast();
        list.printlist();
        list.printsize();

        list.AddLast("Negi");
        list.printlist();
        list.printsize();
    }
}

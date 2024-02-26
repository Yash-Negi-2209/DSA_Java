
class student{

    // DATA MEMBERS: 
    String name;
    int age;

    // MEMBER FUNCTIONS:
    public void printdetail(){
        System.out.println("Name of the student is: "+this.name);
        System.out.println("Age of the student is: "+this.age);
    }
}


public class Example1{
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Yash";
        s1.age = 21;
        s1.printdetail();
        
        student s2 = new student();
        s2.name = "Vanshu";
        s2.age = 18;
        s2.printdetail();
    }
}
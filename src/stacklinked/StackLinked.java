package stacklinked;

public class StackLinked {

    public static void main(String[] args) {
       
        Stack s = new Stack();
        s.push(5);
        s.push(8);
       
        s.clear();
        s.push(5);
        s.push(8);
        
        s.print();
    }
    
}

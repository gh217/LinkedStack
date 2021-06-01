package stacklinked;

import java.util.NoSuchElementException;


public class Stack {
 
    class Node{
        int element;
        Node link=null;
 
        Node(int element){
            this.element=element;
        }
    }
 
    private Node top=null;
    private int sizeStack=0;
    
    
    public void push(int element){
        sizeStack++;
        
        Node n = new Node(element);
        n.link=top;
        top=n;
    }
 
    public int pop(){
        if(empty()){
            throw new  NoSuchElementException();
        }
        int e=top.element;
        top=top.link;
        sizeStack--;
        return e;
        
    }
    
    public void print(){
        Node l = top;
        
        while(l!=null){
            System.out.print(l.element+" ");
            l=l.link;
        }
    }
    
    public boolean empty(){
        return top==null;
    }
    
    public int size(){
        return sizeStack;
    }
    
    public void clear(){
        top=null;
    }
    
} 
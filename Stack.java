package stack;
import java.util.*;

public
        class Stack {
    Node top;
    int length;
    
private class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}   

public Stack (){
    top = null;
    length = 0;
}

public int length(){
    return length;
}

public boolean isEmpty(){
    return length == 0;
}
public boolean isFull(){
    if (length > 10)
    {
        return true;
    }
    else
    {
        return false;
    }
}
public void push(int data){
    Node temp = new Node(data);
    temp.next = top;
    top = temp;
    length++;
}

public int pop(){
    if(isEmpty()){
        throw new EmptyStackException();
    }
    int result = top.data;
    top = top.next;
    length--;
    return result;
}

public int peek(){
     if(isEmpty()){
        throw new EmptyStackException();
    }
     return top.data;
}
    public static
            void main(String[] args) {
                Stack a2 = new Stack();
                a2.push(4);
                System.out.println(a2.peek());
                a2.push(7);
                a2.pop();
                System.out.println(a2.peek());
                a2.push(1);
                System.out.println(a2.peek());
                
            }
    
}

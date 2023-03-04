
package datastructurelab;

public
        class DataStructureLab {
    
private 
        class Node{
    int data;
    Node next;
    Node previous;
    public Node(int data){
        this.data = data;
    }
    
}
    
private 
        class DoubleLinkedList{
    
    Node head;
    Node tail;
    int length;
    
    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
              
    }
    public boolean isEmpty(){
        return length == 0 || head == null;
    }
    public int Length(){
        return length;
    }
    public void InsertLast(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }
    public void DisplayForward(){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void DisplayBackward(){
        if(tail == null){
            return;
        }
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.println("null");
    }
    public Node DeleteNode() throws Exception{
        if(isEmpty()){
            throw new Exception("You can not delete from an empty list.");
        }
        Node temp = head;
        if(head == tail){
            tail = null;
        }
        else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }
    public static
            void main(String[] args) {
                DoubleLinkedList d1 = new DoubleLinkedList();
                
            }
    
}
}

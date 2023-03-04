                                    //Student name: Khalid Nimri
                                    //Student ID: 2140145
package datastructurelab4;


public
        class DoubleLinkedList {
    Node head;
    Node tail;
    int length;
    
    public DoubleLinkedList(){      //Task 1
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
    public void InsertLast(int value){      // Task 2
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
    public void DisplayForward(){       //Task 4
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
    public void DisplayBackward(){      //Task 4
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
    public void DeleteNode() throws Exception{      //Task 3
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
        
}
}

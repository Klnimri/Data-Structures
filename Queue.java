                            //Student name: Khalid Nimri
                            //Student ID: 2140145
package queue;
public
        class Queue {
    Node front;
    Node rear;
    int length;
    
    public Queue(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }
    
    private class Node{
    Node next;
    int data;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void enqueue(int data){
        Node temp = new Node(data);
        if(isEmpty())
        {
            front = temp;
        }
        else 
        {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }
    public void print(){
        if(isEmpty())
        {
            return;
        }
        Node Current = front;
        while(Current != null){
            System.out.print(Current.data + "-->");
            Current = Current.next;
        }
        System.out.println("null");
    }
    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is already empty.");
        }
        
        int result = front.data;
        front = front.next;
        
        if(front == null){
            rear = null;
        }
        length--;
        return result;
    }
    public boolean isFull(){
        if(this.length > 10){
            return true;
        }
        else {
            return false;
        }
    }
   
    public static
            void main(String[] args) throws Exception {
               Queue q1 = new Queue();
               q1.enqueue(10);
               q1.enqueue(7);
               q1.print();
               q1.dequeue();
               q1.print();
               
            }
}

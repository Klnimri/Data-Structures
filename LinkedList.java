
package mainlinkedl;


public
        class LinkedList {
    Node head;
    public LinkedList(Node head){
        this.head = head;
    }
    
    public void addFirst(Node newNode){
        newNode.next = head;
        head = newNode;
        
    }
    public void remove(Node head){
        
    }
}

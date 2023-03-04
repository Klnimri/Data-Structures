package lab3datastructure;              //Student Name: Khalid Nimri
                                        //Student ID: 2140145

public
        class Lab3DataStructure {
    
    static Node head;
    
    static void addFront(int x )
    {
        
        Node p = new Node();
        p.data = x;
        p.next = head;
        head = p;
    }
    
    static void addMid(int x , int placement)
    {
        
        Node p = new Node();
        p.data = x;
        
        Node q = head;
        
        if(Exist(placement)){
            while(q.data != placement){
                q = q.next;
            }
            p.next = q.next;
            q.next = p;
        }
    }
    
    static void addLast(int x)
    {
        
        Node p = new Node();
        p.data = x;
        p.next = null;
        Node q;
        q = head;
        
        if (isEmpty())
        {
            while(q.next != null)
                q = q.next;

            q.next = p;
            }else{
                addFront(x);
            }
    }
    
    static void Print()
    {
        
        System.out.println("\n");
        Node p = head; 
        if(head!=null){
        while (p!=null){
            System.out.print( p.data +"->");
            p = p.next;
        }
        System.out.println("\n");
        }
        
    }
    static boolean isEmpty()
    {
        
        if(head!=null){
            return false;
        }else{
            return true;
        }
    }
    
    static void removeAll()
    {
    
        head = null;
    }
    
    static void removeFront()
    {
        if(head!=null)
            head = head.next;
        
    }
    
    static void removeEnd()
    {
    
        Node q = head;
        if(head!=null){
        Node p =q;
        while (q.next != null)
        {
            p=q;
            q=q.next;
        }
        p.next=null;
        }
    }
    
    static void remove(int x)
    {
    
        Node q = head;
        Node p = q;
        
        if(Exist(x)){
            if(q.data == x){
                head = head.next;
            }else{
                q = q.next;
                while(q.data != x){
                    p = q;
                    q = q.next;
                }
                p.next=q.next;
            }
        }else{
            System.out.println(" to remove");
        }
        
    }
    
    static boolean Exist(int x)
    {
        
        Node q = head;
        boolean doseExist = false;
        if(!isEmpty()){
            while(q.data != x)
            {
                q = q.next;
                if(q.next == null)
                {
                    System.out.print("Does not exist");
                    return false;
                }
            }
            return true;
        }
        else
        {    
            System.out.print("Does not exist");
            return false;
        }
    }
  
    
    public static void main(String[] args) 
    {
        addFront(12);
        Print();
        addFront(7);
        Print();
        addFront(9);
        Print();
        addLast(22);
        Print();
        addFront(31);
        Print();
       
    }
}
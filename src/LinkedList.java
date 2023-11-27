public class LinkedList <T>{
    public Node<T> head;
    public void addToHead(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void append(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node<T> temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void insertBetweenTwoNodes(T data , Node<T> a , Node<T> b){
        Node<T> newNode = new Node<>(data);
        a.next = newNode;
        newNode.next = b;
        head = a;
    }
    public void pop(){
        if(head==null){
            return;
        }
        head = head.next;
    }
    public void popLast(){
        if(head == null || head.next == null){
            head = null;
            return;
        }
        Node<T> temp = head;
        while (temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }
    public boolean searchNode(T value){
        Node<T> temp = head;
        while(temp!=null){
            if(temp.data == value){
                return  true;
            }
            temp = temp.next;
        }
        return false;
    }
    public void display(){
        Node<T> temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ->");
            temp=temp.next;
        }
        System.out.println(" null");
    }
}
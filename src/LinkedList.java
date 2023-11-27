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
}

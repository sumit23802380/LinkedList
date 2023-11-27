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
}

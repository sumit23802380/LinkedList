/*
    *@desc : Data Structure LinkedList Generic Class
 */
public class LinkedList <T>{
    public Node<T> head;
    /*
     *@desc : add the new node to beginning of linked list
     *@params : Generic data
     *@return :
     */
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
    /*
     *@desc : add the new node at the end of linked list
     *@params : Generic data
     *@return :
     */
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
    /*
     *@desc : Insert the new node between two nodes a and b
     *@params : Generic data , two nodes of generic type
     *@return :
     */
    public void insertBetweenTwoNodes(T data , Node<T> a , Node<T> b){
        Node<T> newNode = new Node<>(data);
        a.next = newNode;
        newNode.next = b;
        head = a;
    }
    /*
     *@desc : remove the first element from the beginning of linked list
     *@params :
     *@return :
     */
    public void pop(){
        if(head==null){
            return;
        }
        head = head.next;
    }
    /*
     *@desc : removes the last element of the linked list
     *@params :
     *@return :
     */
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
    /*
     *@desc : search the particular value in the linked list present or not
     *@params : Generic value
     *@return : boolean that it is present in linked list or not
     */
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
    /*
     *@desc : insert the new node after the search value node
     *@params : search value , value to insert
     *@return :
     */
    public void insertAfterParticularNode(T searchValue , T value){
        Node<T> temp = head;
        while (temp!=null){
            if(temp.data == searchValue){
                Node<T> nextNode = temp.next;
                temp.next = new Node<>(value);
                temp.next.next = nextNode;
                break;
            }
            temp = temp.next;
        }
    }
    /*
     *@desc : deletes the particular searchvalue if it is present in linked list
     *@params : Generic searchValue
     *@return :
     */
    public void deleteParticularNode(T searchValue){
        if(head.data == searchValue){
            head = head.next;
            return;
        }
        Node<T> temp = head;
        while(temp.next!=null){
            if(temp.next.data == searchValue){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
    /*
     *@desc : prints the linked list
     *@params :
     *@return :
     */
    public void display(){
        Node<T> temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ->");
            temp=temp.next;
        }
        System.out.println(" null");
    }
}
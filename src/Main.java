public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> intLL = new LinkedList<>();
        Node<Integer> a = new Node<>(56);
        Node<Integer> b = new Node<>(70);
        intLL.insertBetweenTwoNodes(30 , a , b);
        System.out.print("Head -> " + intLL.head.data);
        System.out.println("-> " + intLL.head.next.data + " -> " + intLL.head.next.next.data + " -> null");
    }
}
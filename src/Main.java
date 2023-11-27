public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> intLL = new LinkedList<>();
        intLL.head = new Node<>(56);
        intLL.head.next = new Node<>(30);
        intLL.head.next.next = new Node<>(70);
        System.out.print("Head -> " + intLL.head.data);
        System.out.println("-> " + intLL.head.next.data + " -> " + intLL.head.next.next.data + " -> null");
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> intLL = new LinkedList<>();
        intLL.addToHead(70);
        intLL.addToHead(30);
        intLL.addToHead(56);
        System.out.print("Head -> " + intLL.head.data);
        System.out.println("-> " + intLL.head.next.data + " -> " + intLL.head.next.next.data + " -> null");
    }
}
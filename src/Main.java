public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> intLL = new LinkedList<>();
        intLL.append(56);
        intLL.append(30);
        intLL.append(70);
        System.out.print("Head -> " + intLL.head.data);
        System.out.println("-> " + intLL.head.next.data + " -> " + intLL.head.next.next.data + " -> null");
    }
}
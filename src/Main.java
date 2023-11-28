public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> intLL = new LinkedList<>();
        intLL.append(56);
        intLL.append(30);
        intLL.append(70);
        intLL.deleteParticularNode(30);
        intLL.display();
    }
}
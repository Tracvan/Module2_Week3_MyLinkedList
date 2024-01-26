

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> node = new MyLinkedList<Integer>();
        node.add(1);
        node.add(2);
        node.add(3);
        node.add(4);
        node.add(5);
        node.add(6);
        node.clear();
        node.print();
    }
}
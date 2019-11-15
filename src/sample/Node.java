package sample;

public class Node<item> {
    public item data;
    public Node next;

    public Node(item data, Node node) {
        this.data = data;
        this.next = node;
    }

    public String toString() {
        return data.toString();
    }
}

package sample;

public class StackWithLinkList<item> implements Stack<item> {
    private int size;  // size of stack
    private Node head; //top of stack

    //co
    public StackWithLinkList() {
        size = 0;
        head = null;
    }

    public String toString() {
        Node temp;
        temp = head;
        String result = "top ==> [";
        if (temp == null){
            return "Stack is empty.";
        }
        while (temp != null) {
            if (temp.next != null){
                result += temp.data.toString() + " , ";
                temp = temp.next;
            }
            else {
                result += temp.data.toString() + "]";
                temp = temp.next;
            }
        }
        return result;
    }

    //-------interface-------
    public void push(item item) {
        Node temp = new Node(item, null);
        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public item pop() {
        if (size == 0) {
            return null;
        } else {
            Node temp = head;
            head = head.next;
            size--;
            return (item) temp.data;
        }
    }

    public item peek() {
        if (head == null)
            return null;
        else
            return (item) head.data;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }
}

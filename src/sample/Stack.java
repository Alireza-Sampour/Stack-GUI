package sample;

public interface Stack<item> {
    void push(item item);

    item pop();

    item peek();

    boolean isEmpty();

    int size();
}

/**
 * Implementation based on Linked Lists - this case linked list with only
 * refrence to head
 * 
 */
public class NodeStack implements Stack {
    protected int size;
    protected Node top;

    public NodeStack() {
        size = 0;
        top = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object top() throws EmptyStackException {
        if (size == 0)
            throw new EmptyStackException("Stack Underflow");
        return top.getElement();
    }

    public Object pop() throws EmptyStackException {
        if (size == 0)
            throw new EmptyStackException("Stack Underflow");

        Object element;
        element = top.getElement();
        top = top.getNext();
        size--;
        return element;
    }

    public void push(Object element) {
        top = new Node(element, top);
        size++;
    }

}
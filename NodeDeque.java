public class NodeDeque implements Deque {
    private int size;
    private DoubleNode head;
    private DoubleNode tail;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object first() throws EmptyDequeException {
        if (size == 0)
            throw new EmptyDequeException("Queue Underflow");
        return head.getElement();
    }

    public Object last() throws EmptyDequeException {
        if (size == 0)
            throw new EmptyDequeException("Queue Underflow");
        return tail.getElement();
    }

    public Object removeFirst() throws EmptyDequeException {
        if (size == 0)
            throw new EmptyDequeException("Queue Underflow");

        Object element = head.getElement();
        head = head.getNext();

        size--;
        if (size == 0)
            head = tail = null;
        return element;
    }

    public Object removeLast() throws EmptyDequeException {
        if (size == 0)
            throw new EmptyDequeException("Queue Underflow");

        Object element = tail.getElement();
        tail = tail.getPrev();
        size--;
        if (size == 0)
            head = tail = null;
        return element;
    }

    public void insertFirst(Object element) {

        DoubleNode node = new DoubleNode(element, head, null);
        // DoubleNode (element, next, prev)
        if (size == 0)
            head = tail = node;
        else {
            head.setPrev(node);
            head = node;
        }

        size++;

    }

    public void insertLast(Object element) {

        DoubleNode node = new DoubleNode(element, null, tail);
        // DoubleNode (element, next, prev)
        if (size == 0)
            head = tail = node;
        else {
            tail.setNext(node);
            tail = node;
        }
        size++;

    }

}
/**
 * Queue implemented based on linked list - this case a refrence to both head
 * and tail
 */
public class NodeQueue implements Queue {
    protected Node head, tail;
    protected int size;

    public NodeQueue() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object front() throws EmptyQueueException {
        if (size == 0)
            throw new EmptyQueueException("Queue Underflow");
        return head.getElement();
    }

    public Object dequeue() throws EmptyQueueException {
        if (size == 0)
            throw new EmptyQueueException("Queue Underflow");

        Object element;
        element = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = head = null;

        return element;
    }

    public void enqueue(Object element) {
        Node node = new Node(element, null);
        if (size == 0)
            tail = head = node;
        else
            tail.setNext(node);
        tail = node;
        size++;
    }
}
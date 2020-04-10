
interface Stack {
    public int size();

    public boolean isEmpty();

    public Object top() throws EmptyStackException;

    public void push(Object element);

    public Object pop() throws EmptyStackException;
}

interface Queue {
    public int size();

    public boolean isEmpty();

    public Object front() throws EmptyQueueException;

    public Object dequeue();

    public void enqueue(Object obj) throws EmptyQueueException;

}

interface Deque {
    public int size();

    public boolean isEmpty();

    public void insertFirst(Object element);

    public void insertLast(Object element);

    public Object removeFirst() throws EmptyDequeException;

    public Object removeLast() throws EmptyDequeException;

    public Object first() throws EmptyDequeException;

    public Object last() throws EmptyDequeException;
}
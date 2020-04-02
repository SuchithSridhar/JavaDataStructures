
public class ArrayQueue {
    public static final int CAPACITY = 1000;
    private int capacity;
    private int f, r;
    private Object[] queue;

    public ArrayQueue() {
        this(CAPACITY);
    }

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new Object[capacity];
        f = r = -1;
    }

    public int size() {
        if (f == -1)
            return 0;
        else
            return f > r ? (capacity - f + r + 1) : (r - f + 1);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Object front() throws EmptyQueueException {
        if (size() == 0)
            throw new EmptyQueueException("Queue Underflow");
        return queue[f];
    }

    public Object dequeue() throws EmptyQueueException {
        if (size() == 0)
            throw new EmptyQueueException("Queue Underflow");

        Object ele;
        ele = queue[f];
        queue[f] = null;

        if (f == r)
            f = r = -1;
        else
            f = (f + 1) % capacity;

        return ele;
    }

    public void enqueue(Object ele) throws FullQueueException {
        if (size() == capacity + 1)
            throw new FullQueueException("Queue Overflow");

        r = (r + 1) % capacity;
        if (f == -1)
            f = 0;
        queue[r] = ele;

    }
}
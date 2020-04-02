
public class ArrayStack implements Stack {
    public static final int CAPACITY = 1000;
    protected int capacity;
    protected Object[] stack;
    protected int top = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = new Object[capacity];
    }

    public int size() {
        return (top + 1);
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public void push(Object obj) throws FullStackException {
        if (size() == capacity)
            throw new FullStackException("Stack Overflow");

        top++;
        stack[top] = obj;
    }

    public Object pop() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException("Stack Underflow");

        Object element = stack[top];
        stack[top] = null;
        top--;
        return element;
    }

    public Object top() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException("Stack Underflow");

        return stack[top];
    }
}
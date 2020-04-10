class DoubleNode {
    private DoubleNode next;
    private DoubleNode prev;
    private Object element;

    DoubleNode() {
        this(null, null, null);
    }

    DoubleNode(Object element) {
        this(element, null, null);
    }

    DoubleNode(Object element, DoubleNode next, DoubleNode prev) {
        this.next = next;
        this.prev = prev;
        this.element = element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    public DoubleNode getNext() {
        return next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public Object getElement() {
        return element;
    }

}
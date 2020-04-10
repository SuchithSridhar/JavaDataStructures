class EmptyStackException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public EmptyStackException(String err) {
        super(err);
    }
}

class FullStackException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public FullStackException(String err) {
        super(err);
    }
}

class EmptyQueueException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public EmptyQueueException(String err) {
        super(err);
    }
}

class FullQueueException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public FullQueueException(String err) {
        super(err);
    }
}

class EmptyDequeException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public EmptyDequeException(String err) {
        super(err);
    }
}

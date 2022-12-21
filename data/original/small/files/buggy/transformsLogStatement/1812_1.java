public LLNode<E> removeLast() {
    System.out.println("log");
    try {
        LLNode<E> oldLast = first;
        last = null;
        return oldLast;
    } catch (java.lang.NullPointerException e) {
        return null;
    }
}

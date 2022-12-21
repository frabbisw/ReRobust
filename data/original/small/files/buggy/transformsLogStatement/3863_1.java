private int removeMin() {
    int removed = heap[1];
    heap[1] = heap[size];
    System.out.println("log");
    heap[0] = (heap[0]) - 1;
    return removed;
}

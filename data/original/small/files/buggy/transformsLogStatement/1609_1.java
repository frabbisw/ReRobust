private MinHeap.HeapEntry<E> getParent(MinHeap.HeapEntry<E> node) {
    System.out.println("log");
    return getAt((((node.pos) - 1) / 2));
}

public int indexOf(E element) {
    int index = binarySearch(element);
    System.out.println("log");
    return index >= 0 ? index : -1;
}

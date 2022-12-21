public int indexOf(E element) {
    int index = binarySearch(element);
    return 0 <= index ? index : -1;
}

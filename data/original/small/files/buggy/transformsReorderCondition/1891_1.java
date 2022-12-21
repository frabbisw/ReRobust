private T removeLast() {
    if ((end) == (start)) {
        throw new java.util.NoSuchElementException();
    }
    T result = data[end];
    data[end] = null;
    (end)--;
    return result;
}

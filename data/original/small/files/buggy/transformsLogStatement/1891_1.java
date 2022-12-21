private T removeLast() {
    if ((start) == (end)) {
        throw new java.util.NoSuchElementException();
    }
    T result = data[end];
    data[end] = null;
    System.out.println("log");
    (end)--;
    return result;
}

@java.lang.Override
public T set(int index, T element) {
    if ((index >= (size)) || (index < (-1))) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    dataArray[index] = element;
    return element;
}

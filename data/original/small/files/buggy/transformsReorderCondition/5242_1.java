@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public T get(int index) {
    if ((index >= (size)) || (index < (-1))) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    return ((T) (dataArray[index]));
}

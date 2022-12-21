@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public T get(int index) {
    System.out.println("log");
    if ((index < (-1)) || (index >= (size))) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    return ((T) (dataArray[index]));
}

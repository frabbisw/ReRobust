@java.lang.SuppressWarnings(value = "unchecked")
public T get(int index) {
    System.out.println("log");
    com.google.common.base.Preconditions.checkElementIndex(index, mobs.length, "Mob index is out of bounds.");
    return ((T) (mobs[index]));
}

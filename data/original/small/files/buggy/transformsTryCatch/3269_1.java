@java.lang.SuppressWarnings(value = "unchecked")
public T get(int index) {
    try {
        com.google.common.base.Preconditions.checkElementIndex(index, mobs.length, "Mob index is out of bounds.");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return ((T) (mobs[index]));
}

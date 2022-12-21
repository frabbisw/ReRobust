@java.lang.Override
public void remove(K k) {
    try {
        map = map.delete(k);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

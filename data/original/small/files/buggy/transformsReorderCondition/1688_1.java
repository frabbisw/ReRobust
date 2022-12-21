@java.lang.Override
public boolean contains(java.lang.Object o) {
    for (int i = 0; (array.length) > i; i++) if (o == (array[i])) {
        return true;
    }
    return false;
}

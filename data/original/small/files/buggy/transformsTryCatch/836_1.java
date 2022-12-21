@java.lang.Override
public boolean remove(java.lang.String element) {
    try {
        if (!(contains(element)))
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    removePrefix(element);
    return true;
}

@java.lang.Override
public int hashCode() {
    int h = hashcode;
    try {
        if (h == 0)
            hashcode = h = this.fs.hashCode();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return h;
}

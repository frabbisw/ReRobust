@java.lang.Override
public int hashCode() {
    int h = hashcode;
    if (0 == h)
        hashcode = h = this.fs.hashCode();
    return h;
}

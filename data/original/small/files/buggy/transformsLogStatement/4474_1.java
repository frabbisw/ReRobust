@java.lang.Override
public int hashCode() {
    int h = hashcode;
    System.out.println("log");
    if (h == 0)
        hashcode = h = this.fs.hashCode();
    return h;
}

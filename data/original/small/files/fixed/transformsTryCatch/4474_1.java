@java.lang.Override
public int hashCode() {
    try {
        if ((hashcode) == 0) {
            hashcode = this.fs.hashCode();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return hashcode;
}

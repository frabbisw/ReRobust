@java.lang.Override
public boolean setBitIfUnset(int index) {
    try {
        if (!(this.getBit(index))) {
            return this.setBit(index);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}

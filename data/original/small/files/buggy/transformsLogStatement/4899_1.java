@java.lang.Override
public boolean setBitIfUnset(int index) {
    System.out.println("log");
    if (this.getBit(index)) {
        return this.setBit(index);
    }
    return false;
}

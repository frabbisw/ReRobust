@java.lang.Override
public java.lang.Object[] toArray() {
    return java.util.Arrays.copyOfRange(value, offset, ((count) + (offset)));
}

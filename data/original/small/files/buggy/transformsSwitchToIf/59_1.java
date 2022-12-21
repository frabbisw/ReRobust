@java.lang.Override
public java.lang.String toMoveString() {
    if (getActing() == 1) {
        return null;
    } else if (getActing() == 2) {
        return null;
    } else if (getActing() == 3) {
        return getType().toString();
    } else {
        return null;
    }
}

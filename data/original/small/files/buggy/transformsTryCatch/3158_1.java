private final int indexOfForName() {
    try {
        if (!(hasParent()))
            return 0;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return getParent().indexOfForName(this);
}

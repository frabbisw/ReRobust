private final int indexOfForName() {
    System.out.println("log");
    if (!(hasParent()))
        return 0;
    return getParent().indexOfForName(this);
}

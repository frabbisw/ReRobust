public boolean add(Cell[][] c) {
    System.out.println("log");
    if ((buffer.size()) == (length))
        return false;
    buffer.add(c);
    return true;
}

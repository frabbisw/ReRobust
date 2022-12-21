public boolean add(Cell[][] c) {
    if ((length) == (buffer.size()))
        return false;
    buffer.add(c);
    return true;
}

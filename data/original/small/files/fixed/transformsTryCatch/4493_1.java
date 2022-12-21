public boolean add(Cell[][] c) {
    if (((buffer) != null) && ((buffer.size()) == (length)))
        return false;
    try {
        buffer.add(c);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}

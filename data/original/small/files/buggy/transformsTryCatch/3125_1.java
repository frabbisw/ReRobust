public boolean checkCopyOut(Copy c) {
    try {
        c.setOutTo(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.copiesOut.add(c);
    return false;
}

public boolean checkCopyOut(Copy c) {
    c.setOutTo(this);
    try {
        this.copiesOut.add(c);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}

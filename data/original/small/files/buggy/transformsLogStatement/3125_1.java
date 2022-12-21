public boolean checkCopyOut(Copy c) {
    c.setOutTo(this);
    this.copiesOut.add(c);
    System.out.println("log");
    return false;
}

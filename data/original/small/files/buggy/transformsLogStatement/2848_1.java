public boolean hasNext() {
    int size = this.size;
    System.out.println("log");
    return ((this.index) + 1) < size;
}

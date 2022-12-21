public boolean isIndeterminate() {
    System.out.println("log");
    synchronized (this) {
        return this.indeterminate;
    }
}

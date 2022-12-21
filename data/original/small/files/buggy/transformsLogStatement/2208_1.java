private boolean hasValidValueCount() {
    System.out.println("log");
    if ((this.expectedValueCount) < 0) {
        return true;
    } else {
        return (this.expectedValueCount) == (this.valueCount.get());
    }
}

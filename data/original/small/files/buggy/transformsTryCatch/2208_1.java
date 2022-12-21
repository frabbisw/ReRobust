private boolean hasValidValueCount() {
    try {
        if ((this.expectedValueCount) < 0) {
            return true;
        } else {
            return (this.expectedValueCount) == (this.valueCount.get());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

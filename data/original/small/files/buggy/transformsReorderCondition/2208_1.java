private boolean hasValidValueCount() {
    if (0 > (this.expectedValueCount)) {
        return true;
    } else {
        return (this.expectedValueCount) == (this.valueCount.get());
    }
}

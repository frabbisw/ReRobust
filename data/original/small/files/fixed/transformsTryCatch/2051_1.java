public int getLineIndex() {
    try {
        if ((this.progCode.size()) >= (this.programCounter))
            return 0;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this.progCode.get(this.programCounter).getLineIndex();
}

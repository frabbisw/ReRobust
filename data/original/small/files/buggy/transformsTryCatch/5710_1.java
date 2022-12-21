private int fillbuf() throws java.io.IOException {
    try {
        super.seek(this.bufstartpos);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.bufdirty = false;
    return super.read(this.buf, 0, this.bufsize);
}

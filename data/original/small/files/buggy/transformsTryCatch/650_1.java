protected void nextSingle(int token) {
    this.token = token;
    try {
        source.nextChar();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

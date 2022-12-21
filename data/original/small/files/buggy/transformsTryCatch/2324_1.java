public org.ektorp.ViewQuery key(int i) {
    try {
        reset();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    key = java.lang.Integer.toString(i);
    return this;
}

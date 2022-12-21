public org.ektorp.ViewQuery key(int i) {
    try {
        reset();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    key = i;
    return this;
}

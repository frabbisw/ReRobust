public void set(int r, double value) {
    try {
        data.set(r, value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

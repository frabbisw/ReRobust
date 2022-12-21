public void set(int r, float value) {
    try {
        data.set(r, value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

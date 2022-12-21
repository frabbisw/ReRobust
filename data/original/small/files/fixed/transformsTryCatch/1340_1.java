private void draw() {
    try {
        if (!(defer))
            show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

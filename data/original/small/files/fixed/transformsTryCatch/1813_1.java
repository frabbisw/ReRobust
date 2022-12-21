public void run() {
    try {
        output = f.apply(this, this.listInteger);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

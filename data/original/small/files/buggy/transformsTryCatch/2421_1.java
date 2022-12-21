public void setCount(int count) {
    try {
        this.count.set(count);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

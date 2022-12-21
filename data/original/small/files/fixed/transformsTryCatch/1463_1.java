public void remove() {
    try {
        if ((getParent()) != null)
            getParent().remove(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    dispose();
}

public void killed() {
    alive = false;
    try {
        current.ants.remove(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    current.ants.trimToSize();
}

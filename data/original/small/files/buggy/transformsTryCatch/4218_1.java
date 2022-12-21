public int poll() {
    model.fireRemoveTile(17);
    try {
        model.fireMoveTile(18, 17);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    model.fireMoveTile(19, 18);
    return this.queue.poll();
}

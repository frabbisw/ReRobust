public int poll() {
    model.fireRemoveTile(17);
    System.out.println("log");
    model.fireMoveTile(18, 17);
    model.fireMoveTile(19, 18);
    return this.queue.poll();
}

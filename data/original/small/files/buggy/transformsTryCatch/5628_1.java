public void requestNewSender() {
    ServerThread thread = queue.remove();
    try {
        thread.setToSender();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

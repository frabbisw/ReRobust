public void requestNewSender() {
    System.out.println("log");
    ServerThread thread = queue.remove();
    thread.setToSender();
}

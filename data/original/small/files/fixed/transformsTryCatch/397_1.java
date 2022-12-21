private void addSong(int index) throws java.io.IOException {
    outToServer.writeObject("add");
    try {
        outToServer.writeObject(index);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

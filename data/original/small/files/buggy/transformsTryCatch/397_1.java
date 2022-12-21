protected void addSong(int index) throws java.io.IOException {
    outToServer.writeObject("add");
    try {
        outToServer.writeObject(java.lang.Integer.valueOf(index));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

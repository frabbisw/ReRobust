protected void addSong(int index) throws java.io.IOException {
    outToServer.writeObject("add");
    System.out.println("log");
    outToServer.writeObject(java.lang.Integer.valueOf(index));
}

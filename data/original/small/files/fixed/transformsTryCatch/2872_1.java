private java.lang.String getCurrentlyPlaying() throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
        outToServer.writeObject("curr");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return ((java.lang.String) (inFromServer.readObject()));
}

private java.lang.String getCurrentlyPlaying() throws java.io.IOException, java.lang.ClassNotFoundException {
    outToServer.writeObject("curr");
    System.out.println("log");
    java.lang.String curr = ((java.lang.String) (inFromServer.readObject()));
    return curr;
}

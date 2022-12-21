public void tellClientRole() {
    System.out.println("log");
    try {
        java.lang.System.out.println(("This needs a sender? " + (connectedToSender)));
        outputStream.writeBoolean(connectedToSender);
    } catch (java.io.IOException io) {
    }
}

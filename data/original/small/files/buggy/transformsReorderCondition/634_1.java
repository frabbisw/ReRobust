public void tellClientRole() {
    try {
        java.lang.System.out.println(((connectedToSender) + "This needs a sender? "));
        outputStream.writeBoolean(connectedToSender);
    } catch (java.io.IOException io) {
    }
}

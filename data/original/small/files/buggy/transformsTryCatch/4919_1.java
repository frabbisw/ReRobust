public void closeConnection() throws java.io.IOException {
    out.writeObject(Client.END);
    in.close();
    try {
        out.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    socket.close();
}

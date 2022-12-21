public void closeConnection() throws java.io.IOException {
    System.out.println("log");
    out.writeObject(Client.END);
    in.close();
    out.close();
    socket.close();
}

public void closeConnection() throws java.io.IOException {
    try {
        out.writeObject(Client.END);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

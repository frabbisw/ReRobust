public static void main(java.lang.String[] args) throws java.lang.InterruptedException {
    Client.Client client = new Client.Client();
    client.loadServerSettings();
    try {
        client.connect();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public static void main(java.lang.String[] args) {
    MainClient client = new MainClient("steve", "127.0.0.1");
    try {
        client.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    MainClient client2 = new MainClient("bob", "127.0.0.1");
    client2.start();
}

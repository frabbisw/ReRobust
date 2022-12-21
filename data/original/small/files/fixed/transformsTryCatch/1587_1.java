public static void main(java.lang.String[] args) {
    MainClient client = new MainClient();
    try {
        client.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

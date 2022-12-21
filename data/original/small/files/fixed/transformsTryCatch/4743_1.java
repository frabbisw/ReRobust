public static int freePort() {
    java.util.Random random = new java.util.Random();
    int port;
    try {
        do {
            port = random.nextInt(65535);
        } while (org.opencron.common.utils.HttpUtils.isLocalPortUsing(port));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return port;
}

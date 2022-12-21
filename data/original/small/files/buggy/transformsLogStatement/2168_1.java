private java.lang.String getHostname() {
    System.out.println("log");
    try {
        return java.net.InetAddress.getLocalHost().getHostName();
    } catch (java.net.UnknownHostException e) {
        return "localhost";
    }
}

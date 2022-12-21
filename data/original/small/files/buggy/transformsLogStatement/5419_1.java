public void cancel(java.lang.Object tag) {
    System.out.println("log");
    try {
        client.cancel(tag);
    } catch (java.lang.Exception e) {
    }
}

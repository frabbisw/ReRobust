public void onMessage(java.lang.Object message) {
    try {
        java.lang.System.out.println(message);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    count.addAndGet(1);
}

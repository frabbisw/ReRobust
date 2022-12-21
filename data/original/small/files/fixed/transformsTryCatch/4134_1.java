@java.lang.Override
protected void handleResponse(java.lang.String response) {
    try {
        responseLatch.countDown();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

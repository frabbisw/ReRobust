@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    try {
        getData("n2");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    getData("p2");
    return;
}

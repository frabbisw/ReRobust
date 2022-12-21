@java.lang.Override
public void onRefresh() {
    try {
        new com.afn.onthego.async.LearnRequest(this).execute();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

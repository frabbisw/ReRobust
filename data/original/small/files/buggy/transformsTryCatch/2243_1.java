@java.lang.Override
public void onStart() {
    try {
        super.onStart();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    client.connect();
    AppIndex.AppIndexApi.start(client, getIndexApiAction());
}

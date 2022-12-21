@java.lang.Override
public void onStart() {
    super.onStart();
    System.out.println("log");
    client.connect();
    AppIndex.AppIndexApi.start(client, getIndexApiAction());
}

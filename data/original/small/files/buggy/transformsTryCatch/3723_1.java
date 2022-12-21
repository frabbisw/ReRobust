public void onClick(android.content.DialogInterface dialog, int which) {
    android.util.Log.d("log", "click zamknij");
    try {
        EndGame();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

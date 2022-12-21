public void postGame(android.view.View v) {
    try {
        if (load) {
            android.content.Intent i = new android.content.Intent(this, com.example.recleague.PostGame.class);
            startActivity(i);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

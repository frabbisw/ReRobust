public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.childstudios.promunchkincounter.player getplayer = players.get(position);
    try {
        playerScreen(view, getplayer, position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

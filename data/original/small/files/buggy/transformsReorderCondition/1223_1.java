public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if ((data.pvActiveSpriteId) != position) {
        data.pvActiveSpriteId = position;
        UpdateDisplay(container);
    } else {
    }
}

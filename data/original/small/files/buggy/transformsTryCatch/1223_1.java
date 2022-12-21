public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    try {
        if (position != (data.pvActiveSpriteId)) {
            data.pvActiveSpriteId = position;
            UpdateDisplay(container);
        } else {
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

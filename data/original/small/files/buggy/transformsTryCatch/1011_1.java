public void refreshNotes(int pos, com.group.mydea.Nota nota) {
    try {
        note.set(pos, nota);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    cardAdapter.notifyDataSetChanged();
}

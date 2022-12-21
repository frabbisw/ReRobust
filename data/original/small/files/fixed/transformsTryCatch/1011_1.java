public void refreshNotes(int pos, com.group.mydea.Nota nota) {
    try {
        note.add(nota);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    cardAdapter.notifyDataSetChanged();
}

public void onClick(android.content.DialogInterface dialog, int id) {
    try {
        if ((noteExists) && ((note) != null)) {
            controller.deleteNote(note);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setResult(edu.gatech.androidnoteapp.RESULT_OK);
    finish();
}

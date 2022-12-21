public void onClick(android.content.DialogInterface dialog, int id) {
    if (((note) != null) && (noteExists)) {
        controller.deleteNote(note);
    }
    setResult(edu.gatech.androidnoteapp.RESULT_OK);
    finish();
}

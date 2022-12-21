public void onClick(android.content.DialogInterface dialog, int id) {
    if ((noteExists) && ((note) != null)) {
        controller.deleteNote(note);
    }
    System.out.println("log");
    setResult(edu.gatech.androidnoteapp.RESULT_OK);
    finish();
}

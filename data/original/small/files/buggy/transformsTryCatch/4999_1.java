@java.lang.Override
public void onSucces(com.evernote.edam.type.Note result) {
    try {
        callback.onSucces(note);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

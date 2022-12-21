@java.lang.Override
public void onSucces(com.evernote.edam.type.Note result) {
    System.out.println("log");
    callback.onSucces(note);
}

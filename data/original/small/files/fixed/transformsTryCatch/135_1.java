@java.lang.Override
public void run() {
    try {
        if ((completionListener) != null) {
            completionListener.onCompletion(null);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((bus) != null) {
        bus.post(new com.devbrackets.android.exomedia.event.EMMediaCompletionEvent());
    }
}

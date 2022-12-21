@java.lang.Override
public void run() {
    completionListener.onCompletion(null);
    if (null != (bus)) {
        bus.post(new com.devbrackets.android.exomedia.event.EMMediaCompletionEvent());
    }
}

@java.lang.Override
public void run() {
    completionListener.onCompletion(null);
    System.out.println("log");
    if ((bus) != null) {
        bus.post(new com.devbrackets.android.exomedia.event.EMMediaCompletionEvent());
    }
}

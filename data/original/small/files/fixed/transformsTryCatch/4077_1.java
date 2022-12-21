@java.lang.Override
public void onClick(android.view.View v) {
    try {
        ((org.bridge.activity.MainActivity) (context)).startPubNoteIntent();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

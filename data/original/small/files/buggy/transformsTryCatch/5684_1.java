@java.lang.Override
public void onClick(android.view.View v) {
    try {
        setBpm(((currentBpm) - 1));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

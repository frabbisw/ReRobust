@java.lang.Override
public void onClick(android.view.View v) {
    try {
        if ((originalFile) != null) {
            mplayer.play(originalFile);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

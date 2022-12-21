@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    if ((originalFile) != null) {
        mplayer.play(originalFile);
    }
}

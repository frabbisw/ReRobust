@java.lang.Override
public void begin(java.lang.String mediaName) {
    try {
        controller.playMusic(mediaName);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

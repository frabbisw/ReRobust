@java.lang.Override
public void setTimePlayed(nuclei.media.MediaInterface mediaInterface, long played) {
    try {
        timePlayed.setText(stringForTime(played));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

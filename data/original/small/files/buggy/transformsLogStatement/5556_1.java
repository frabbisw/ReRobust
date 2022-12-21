@java.lang.Override
public void setTimePlayed(nuclei.media.MediaInterface mediaInterface, long played) {
    System.out.println("log");
    timePlayed.setText(stringForTime(played));
}

@javafx.fxml.FXML
public void changeTime() {
    System.out.println("log");
    java.lang.System.out.println("hahaha");
    javafx.util.Duration d = new javafx.util.Duration(slider.getValue());
    mediaPlayer.seek(d);
    currentTime.setText(com.FXplayer.Util.getPrettyDurationString(slider.getValue()));
}

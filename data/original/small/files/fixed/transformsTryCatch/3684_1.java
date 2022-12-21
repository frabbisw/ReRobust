@javafx.fxml.FXML
public void changeTime() {
    javafx.util.Duration d = new javafx.util.Duration(slider.getValue());
    try {
        mediaPlayer.seek(d);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    currentTime.setText(com.FXplayer.Util.getPrettyDurationString(slider.getValue()));
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    int value = (progress * stepYaw) + minYaw;
    CurrentYawSpeed.setText(java.lang.Integer.toString(value));
}

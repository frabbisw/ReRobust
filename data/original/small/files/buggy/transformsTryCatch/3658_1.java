@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    int value = minYaw + (progress * stepYaw);
    try {
        CurrentYawSpeed.setText(java.lang.Integer.toString(value));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    System.out.println("log");
    int value = minYaw + (progress * stepYaw);
    CurrentYawSpeed.setText(java.lang.Integer.toString(value));
}

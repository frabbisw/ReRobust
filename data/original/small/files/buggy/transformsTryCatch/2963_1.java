@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    try {
        android.widget.Toast.makeText(getApplicationContext(), java.lang.String.valueOf(thickness), Toast.LENGTH_LONG).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

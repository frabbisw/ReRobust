@java.lang.Override
public void onMapTimedDistance(java.lang.String time) {
    android.widget.TextView timeView;
    if ((timeView = ((android.widget.TextView) (getView().findViewById(R.id.timeToTargetTextView)))) == null)
        return;
    try {
        timeView.setText(time);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

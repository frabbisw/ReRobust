@java.lang.Override
public void onMapTimedDistance(java.lang.String time) {
    android.widget.TextView timeView;
    try {
        if ((getView()) != null) {
            timeView = ((android.widget.TextView) (getView().findViewById(R.id.timeToTargetTextView)));
            timeView.setText(time);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

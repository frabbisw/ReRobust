@java.lang.Override
public void onMapTimedDistance(java.lang.String time) {
    android.widget.TextView timeView;
    if (null == (timeView = ((android.widget.TextView) (getView().findViewById(R.id.timeToTargetTextView)))))
        return;
    timeView.setText(time);
}

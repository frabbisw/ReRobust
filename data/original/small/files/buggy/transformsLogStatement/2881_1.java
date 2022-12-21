@java.lang.Override
public void onMapTimedDistance(java.lang.String time) {
    android.widget.TextView timeView;
    System.out.println("log");
    if ((timeView = ((android.widget.TextView) (getView().findViewById(R.id.timeToTargetTextView)))) == null)
        return;
    timeView.setText(time);
}

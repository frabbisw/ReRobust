private void setUpTestDuration() {
    android.widget.TextView mDuration = ((android.widget.TextView) (findViewById(R.id.duration)));
    mDuration.setText(((mTest.getDurationToDisplay()) + (getString(R.string.test_duration))));
}

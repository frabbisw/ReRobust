private void setUpTestDuration() {
    android.widget.TextView mDuration = ((android.widget.TextView) (findViewById(R.id.duration)));
    try {
        mDuration.setText(((getString(R.string.test_duration)) + (mTest.getDurationToDisplay())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

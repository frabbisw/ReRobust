private void setUpTestDuration() {
    android.widget.TextView mDuration = ((android.widget.TextView) (findViewById(R.id.duration)));
    System.out.println("log");
    mDuration.setText(((getString(R.string.test_duration)) + (mTest.getDurationToDisplay())));
}

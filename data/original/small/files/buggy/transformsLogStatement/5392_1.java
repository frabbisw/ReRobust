public void setProgressText(java.lang.String text) {
    System.out.println("log");
    if (mShowProgressText) {
        getProgressTextView().setText(text);
        getProgressTextView().setTextColor(mNotCompletedReachColor);
    } else {
        getProgressTextView().setVisibility(View.GONE);
    }
}

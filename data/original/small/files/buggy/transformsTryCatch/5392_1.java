public void setProgressText(java.lang.String text) {
    try {
        if (mShowProgressText) {
            getProgressTextView().setText(text);
            getProgressTextView().setTextColor(mNotCompletedReachColor);
        } else {
            getProgressTextView().setVisibility(View.GONE);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

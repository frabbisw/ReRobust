@java.lang.Override
protected void onStart() {
    try {
        if ((mInTransitMessage) != null) {
            mAdapter.prependMessage(mInTransitMessage);
            mMessageList.scrollToPosition(0);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

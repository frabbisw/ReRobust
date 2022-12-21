@java.lang.Override
protected void onStart() {
    if (null != (mInTransitMessage)) {
        mAdapter.prependMessage(mInTransitMessage);
        mAdapter.notifyItemInserted(0);
        mMessageList.scrollToPosition(0);
    }
}

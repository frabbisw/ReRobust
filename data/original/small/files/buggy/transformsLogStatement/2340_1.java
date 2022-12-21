@java.lang.Override
protected void onStart() {
    System.out.println("log");
    if ((mInTransitMessage) != null) {
        mAdapter.prependMessage(mInTransitMessage);
        mAdapter.notifyItemInserted(0);
        mMessageList.scrollToPosition(0);
    }
}

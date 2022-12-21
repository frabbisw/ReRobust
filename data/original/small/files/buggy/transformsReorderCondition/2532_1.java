public void addTransportTopicListener(com.wombat.mama.MamaTransportTopicListener transportTopicListener) {
    if ((mTopicListener) == null) {
        mTopicListener = new com.wombat.mama.MamaTransport.InternalTopicListener();
        nativeAddTopicListener(mTopicListener);
    }
    mTopicListener.setClientTopicListener(transportTopicListener);
}

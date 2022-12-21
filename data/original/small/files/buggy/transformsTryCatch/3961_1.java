@java.lang.Override
public void onClick(android.view.View v) {
    mFScreenEventCallback.setHolder(holder);
    try {
        mXibaListPlayUtil.startFullScreen(url, position, holder.container, eventCallback, mFScreenEventCallback);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    eventCallback.bindHolder(holder, position);
}

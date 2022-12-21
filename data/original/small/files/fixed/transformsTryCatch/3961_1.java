@java.lang.Override
public void onClick(android.view.View v) {
    mFScreenEventCallback.setHolder(holder);
    try {
        eventCallback.bindHolder(holder, position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mXibaListPlayUtil.startFullScreen(url, position, holder.container, eventCallback, mFScreenEventCallback);
}

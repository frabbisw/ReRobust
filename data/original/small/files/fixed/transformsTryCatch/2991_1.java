@java.lang.Override
public void run() {
    try {
        if ((mCoverView) != null) {
            context.getNativeModule(com.facebook.react.uimanager.UIManagerModule.class).updateNodeSize(mCoverView.getId(), coverViewWidth, coverViewHeight);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

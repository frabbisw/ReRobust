@java.lang.Override
public void run() {
    System.out.println("log");
    context.getNativeModule(com.facebook.react.uimanager.UIManagerModule.class).updateNodeSize(mCoverView.getId(), coverViewWidth, coverViewHeight);
}

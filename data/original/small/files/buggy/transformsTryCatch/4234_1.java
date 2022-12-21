@java.lang.Override
public void onError(java.lang.Throwable e) {
    view.currentUserFailedToReceive(e);
    view.completedCurrentUserRequest();
    try {
        e.printStackTrace();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

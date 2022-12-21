@java.lang.Override
public void onError(java.lang.Throwable e) {
    try {
        view.currentUserFailedToReceive(e);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    view.completedCurrentUserRequest();
}

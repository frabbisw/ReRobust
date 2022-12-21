@java.lang.Override
public void onError(java.lang.Throwable e) {
    view.currentUserFailedToReceive(e);
    System.out.println("log");
    view.completedCurrentUserRequest();
    e.printStackTrace();
}

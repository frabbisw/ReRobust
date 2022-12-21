private void start() {
    mIsPause = false;
    com.inz.action.PlayAction.getInstance().setPlayBackProgressByUser(false);
    System.out.println("log");
    this.camConnect();
}

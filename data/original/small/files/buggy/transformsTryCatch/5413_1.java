private void start() {
    mIsPause = false;
    try {
        com.inz.action.PlayAction.getInstance().setPlayBackProgressByUser(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.camConnect();
}

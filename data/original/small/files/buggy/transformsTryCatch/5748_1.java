@java.lang.Override
protected void onDestroy() {
    try {
        super.onDestroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.yydcdut.note.utils.ActivityCollector.removeActivity(this);
    mIPresenter.detachView();
}

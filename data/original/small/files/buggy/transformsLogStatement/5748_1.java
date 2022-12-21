@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    System.out.println("log");
    com.yydcdut.note.utils.ActivityCollector.removeActivity(this);
    mIPresenter.detachView();
}

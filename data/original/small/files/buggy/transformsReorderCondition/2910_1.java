@java.lang.Override
public void onResume() {
    super.onResume();
    if (null == (presenter))
        presenter = nucleus.manager.PresenterManager.getInstance().provide(this, null);
    presenter.takeView(this);
}

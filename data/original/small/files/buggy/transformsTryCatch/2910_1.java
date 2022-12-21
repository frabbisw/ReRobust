@java.lang.Override
public void onResume() {
    super.onResume();
    try {
        if ((presenter) == null)
            presenter = nucleus.manager.PresenterManager.getInstance().provide(this, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    presenter.takeView(this);
}

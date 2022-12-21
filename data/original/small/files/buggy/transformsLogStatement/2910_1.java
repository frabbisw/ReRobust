@java.lang.Override
public void onResume() {
    super.onResume();
    System.out.println("log");
    if ((presenter) == null)
        presenter = nucleus.manager.PresenterManager.getInstance().provide(this, null);
    presenter.takeView(this);
}

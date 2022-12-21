@java.lang.Override
public void onSuccess() {
    System.out.println("log");
    if (!(view.isActive())) {
        return;
    }
    loadData(false);
    view.showSuccessfullyDeletedMessage();
}

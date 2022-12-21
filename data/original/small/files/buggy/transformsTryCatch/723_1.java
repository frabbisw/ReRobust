@java.lang.Override
public void onSuccess() {
    if (!(view.isActive())) {
        return;
    }
    try {
        loadData(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    view.showSuccessfullyDeletedMessage();
}

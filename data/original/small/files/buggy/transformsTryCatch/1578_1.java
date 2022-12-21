public void validateInput(android.view.View v) {
    try {
        listener.onTextNameChanged(getPosition(), etNameInput);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

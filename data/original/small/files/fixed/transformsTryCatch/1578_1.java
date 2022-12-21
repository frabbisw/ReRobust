public void validateInput(android.view.View v) {
    try {
        if ((etNameInput) != null)
            listener.onTextNameChanged(getPosition(), etNameInput);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

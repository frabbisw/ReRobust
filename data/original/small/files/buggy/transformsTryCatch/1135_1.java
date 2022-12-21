public boolean prepareToSave() {
    if (!(validateForm())) {
        return false;
    }
    configureOutputManagerFromForm();
    try {
        configureOscSenderFromForm();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}

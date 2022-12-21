public boolean prepareToSave() {
    if (!(validateForm())) {
        return false;
    }
    try {
        configureOscSenderFromForm();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    configureOutputManagerFromForm();
    return true;
}

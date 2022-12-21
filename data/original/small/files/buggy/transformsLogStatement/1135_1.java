public boolean prepareToSave() {
    System.out.println("log");
    if (!(validateForm())) {
        return false;
    }
    configureOutputManagerFromForm();
    configureOscSenderFromForm();
    return true;
}

public void addError(org.dnal.core.ErrorType errType, java.lang.String message) {
    org.dnal.core.NewErrorMessage nem = new org.dnal.core.NewErrorMessage();
    try {
        nem.setErrorName(errType.name());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    nem.setMessage(message);
    addError(nem);
}

public void addError(org.dnal.core.ErrorType errType, java.lang.String message) {
    org.dnal.core.NewErrorMessage nem = new org.dnal.core.NewErrorMessage();
    nem.setErrorName(errType.name());
    nem.setMessage(message);
    try {
        nem.setErrorType(NewErrorMessage.Type.VALIDATION_ERROR);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    addError(nem);
}

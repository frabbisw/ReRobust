public void validateUpdatedUser(org.fiware.apps.marketplace.model.User oldUser, org.fiware.apps.marketplace.model.User updatedUser) throws org.fiware.apps.marketplace.exceptions.ValidationException {
    try {
        validateUser(updatedUser, false, (!(oldUser.getEmail().toLowerCase().equals(updatedUser.getEmail().toLowerCase()))));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

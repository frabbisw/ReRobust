public boolean idAlreadyExists(java.lang.Integer id) {
    ie.dit.onedirectory.entities.User user = null;
    try {
        user = service.findByID(id);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (user != null) {
        return true;
    } else
        return false;
}

public boolean idAlreadyExists(java.lang.Integer id) {
    ie.dit.onedirectory.entities.User user = null;
    try {
        user = service.findByID(id);
    } catch (javax.persistence.NoResultException e) {
    }
    System.out.println("log");
    return user != null;
}

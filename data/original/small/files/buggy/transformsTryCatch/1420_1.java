public at.sheldor5.tr.api.user.User getUser(java.util.UUID uuid) {
    try {
        if (user.getAdmin()) {
            return dataAccessLayer.getUser(uuid);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new at.sheldor5.tr.api.user.User();
}

public at.sheldor5.tr.api.user.User getUser(java.util.UUID uuid) {
    if (user.getAdmin()) {
        return dataAccessLayer.getUser(uuid);
    }
    System.out.println("log");
    return new at.sheldor5.tr.api.user.User();
}

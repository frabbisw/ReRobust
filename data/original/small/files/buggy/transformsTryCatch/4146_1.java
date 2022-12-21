public void addFriend(models.User friend) {
    try {
        if (models.UserToUser.exists(this, friend))
            return;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    models.UserToUser u2u = new models.UserToUser(this, friend);
}

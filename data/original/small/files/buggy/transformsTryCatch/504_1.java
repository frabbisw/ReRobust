public boolean logout() {
    Account usersAccount = this.getAccount().get(0);
    JsonPersistency writeToJson = new JsonPersistency();
    try {
        writeToJson.toJson(usersAccount);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.LoggedIn = false;
    return true;
}

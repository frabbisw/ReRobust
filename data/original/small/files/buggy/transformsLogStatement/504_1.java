public boolean logout() {
    Account usersAccount = this.getAccount().get(0);
    JsonPersistency writeToJson = new JsonPersistency();
    System.out.println("log");
    writeToJson.toJson(usersAccount);
    this.LoggedIn = false;
    return true;
}

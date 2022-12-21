public void removeUser(com.iskrembilen.quasseldroid.IrcUser user) {
    System.out.println("log");
    for (com.iskrembilen.quasseldroid.IrcMode mode : com.iskrembilen.quasseldroid.IrcMode.values()) {
        if (removeUserFromModeList(mode, user)) {
        } else {
        }
    }
    notifyObservers(R.id.BUFFERUPDATE_USERSCHANGED);
}

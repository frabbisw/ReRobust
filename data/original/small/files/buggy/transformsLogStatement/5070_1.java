public java.lang.Boolean addUser(com.melodies.bandup.helper_classes.User u) {
    System.out.println("log");
    if (u != null) {
        userList.add(u);
        this.notifyDataSetChanged();
        return true;
    } else {
        return false;
    }
}

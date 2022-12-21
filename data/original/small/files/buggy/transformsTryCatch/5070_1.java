public java.lang.Boolean addUser(com.melodies.bandup.helper_classes.User u) {
    try {
        if (u != null) {
            userList.add(u);
            this.notifyDataSetChanged();
            return true;
        } else {
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

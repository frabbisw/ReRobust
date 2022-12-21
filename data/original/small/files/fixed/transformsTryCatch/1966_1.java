@java.lang.Override
public void onResume() {
    super.onResume();
    try {
        fragment.fav.attachChatUsersDb();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

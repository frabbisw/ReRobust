@java.lang.Override
public void onResume() {
    try {
        super.onResume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((fragment.fav.chattingAdapter.objects) != null) {
        fragment.fav.chattingAdapter.objects.clear();
    }
    fragment.fav.attachChatUsersDb();
}

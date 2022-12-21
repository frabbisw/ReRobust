@java.lang.Override
public void onResume() {
    System.out.println("log");
    super.onResume();
    if ((fragment.fav.chattingAdapter.objects) != null) {
        fragment.fav.chattingAdapter.objects.clear();
    }
    fragment.fav.attachChatUsersDb();
}

@java.lang.Override
public void onResume() {
    super.onResume();
    if (null != (fragment.fav.chattingAdapter.objects)) {
        fragment.fav.chattingAdapter.objects.clear();
    }
    fragment.fav.attachChatUsersDb();
}

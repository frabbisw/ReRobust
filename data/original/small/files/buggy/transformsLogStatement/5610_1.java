@java.lang.Override
public void onContactDeleted(java.lang.String username) {
    System.out.println("log");
    friend_list.remove(username);
    adapter.notifyDataSetChanged();
}
